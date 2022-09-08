package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.common.*;
import com.domain.preorder;
import com.domain.preorderExample;
import com.domain.user;
import com.mapper.preorderMapper;
import com.model.*;
import com.thoughtworks.xstream.XStream;
import com.util.getopenid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;


@RestController
public class xiadanController {

    @Resource
    private preorderMapper preorderMapper;

    private String prepay_id;

    @RequestMapping("/weixinpay/xiadan")
    public JSONObject xiadan(@RequestBody JSONObject jsonObject) throws IllegalAccessException, UnrecoverableKeyException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        String code = jsonObject.getString("code");
        String openid = new getopenid().openid(code);
        String masg = jsonObject.getString("masg");
        OrderInfo order = new OrderInfo();


        if (masg.equals("pic")){
            order.setBody("查看照片");
            order.setTotal_fee(100);
        }else if (masg.equals("get")){
            order.setBody("随机抽取");
            order.setTotal_fee(100);
        }else if (masg.equals("hw")){
            order.setBody("下单作业");
            order.setTotal_fee(200);
        }else if (masg.equals("running")){
            order.setBody("代跑接单");
            order.setTotal_fee(200);
        }else if (masg.equals("course")){
            order.setBody("智慧树刷课");
            order.setTotal_fee(500);
        }else if (masg.equals("help")){
            order.setBody("帮助单");
            order.setTotal_fee(200);
        }else {
            order.setBody("非法下单");
            order.setTotal_fee(20000);
        }

        order.setAppid(Configure.getAppID());
        order.setMch_id(Configure.getMch_id());
        order.setNonce_str(RandomStringGenerator.getRandomStringByLength(32));
        order.setOut_trade_no(RandomStringGenerator.getRandomStringByLength(32));
        order.setSpbill_create_ip("127.0.0.1");
        order.setNotify_url("https://xcx.suplin.fun/weixinpay/PayResult");
//        order.setNotify_url("http://127.0.0.1:8080/weixinpay/PayResult");
        order.setTrade_type("JSAPI");
        order.setOpenid(openid);
        order.setSign_type("MD5");

        //生成签名
        String sign = Signature.getSign(order);
        order.setSign(sign);

        String result = HttpRequest.sendPost("https://api.mch.weixin.qq.com/pay/unifiedorder", order);
        XStream xStream = new XStream();
        xStream.alias("xml", OrderReturnInfo.class);

        OrderReturnInfo returnInfo = (OrderReturnInfo)xStream.fromXML(result);
        JSONObject json = new JSONObject();
        prepay_id = returnInfo.getPrepay_id();

        json.put("prepay_id", prepay_id);

        try {

            preorder preorder = new preorder();
            preorder.setPrepayId(prepay_id);
            preorderMapper.insertSelective(preorder);

        }catch (Exception e){
            System.out.println(e);
        }
        return json;

    }

    @RequestMapping("/weixinpay/sign")
    public JSONObject sign(@RequestBody JSONObject jsonObject) throws IllegalAccessException {
        String repay_id = jsonObject.getString("prepay_id");
        SignInfo signInfo = new SignInfo();
        signInfo.setAppId(Configure.getAppID());
        long time = System.currentTimeMillis()/1000;
        signInfo.setTimeStamp(String.valueOf(time));
        signInfo.setNonceStr(RandomStringGenerator.getRandomStringByLength(32));
        signInfo.setRepay_id("prepay_id="+repay_id);
        signInfo.setSignType("MD5");
        //生成签名
        String sign = Signature.getSign(signInfo);

        JSONObject json = new JSONObject();
        json.put("timeStamp", signInfo.getTimeStamp());
        json.put("nonceStr", signInfo.getNonceStr());
        json.put("package", signInfo.getRepay_id());
        json.put("signType", signInfo.getSignType());
        json.put("paySign", sign);
        return json;
    }

    @RequestMapping("/weixinpay/PayResult")
    public void PayResult(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String reqParams = StreamUtil.read(request.getInputStream());

        XStream xStream = new XStream();
        xStream.alias("xml", ResultReturnInfo.class);
        ResultReturnInfo resultReturnInfo = (ResultReturnInfo)xStream.fromXML(reqParams);

        String result_code = resultReturnInfo.getResult_code();

        if (result_code.equals("SUCCESS")){

            preorderExample preorderExample = new preorderExample();
            preorderExample.createCriteria().andPrepayIdEqualTo(prepay_id);
            preorder preorder = new preorder();
            preorder.setFlag(true);
            preorderMapper.updateByExampleSelective(preorder,preorderExample);
        }


        StringBuffer sb = new StringBuffer("<xml><return_code>SUCCESS</return_code><return_msg>OK</return_msg></xml>");
        response.getWriter().append(sb.toString());
    }



}
