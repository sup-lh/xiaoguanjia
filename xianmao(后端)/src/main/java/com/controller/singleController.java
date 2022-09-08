package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.domain.preorder;
import com.domain.preorderExample;
import com.domain.single;
import com.mapper.preorderMapper;
import com.resp.singleResp;
import com.service.singleService;
import com.suplin.demo.resp.CommonResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class singleController {

    @Autowired
    private singleService singleService;


    @Resource
    private preorderMapper preorderMapper;


    @RequestMapping("/ifhave")
    // 可用  @RequestBody JSONObject jsonObject  接收
    // 可用  @RequestBody singleReq singleReq  接收
    public int ifhave(@RequestBody JSONObject jsonObject) {
        Object index = jsonObject.get("index");

        String selecthave = singleService.selecthave(index);

        if (selecthave.equals("有数据")){
            return 1;
        }else {
            return 0;
        }
    }


    @RequestMapping("/single")
    // 可用  @RequestBody JSONObject jsonObject  接收
    // 可用  @RequestBody singleReq singleReq  接收
    public int single(@RequestBody JSONObject jsonObject) {
            int insert = singleService.insert(jsonObject);
            return insert;
    }

    @RequestMapping("/getsingle")
    // 可用  @RequestBody JSONObject jsonObject  接收
    // 可用  @RequestBody singleReq singleReq  接收
    public JSONObject getsingle(@RequestBody JSONObject jsonObject) {
        Object index = jsonObject.get("index");
        String prepay_id = jsonObject.getString("prepay_id");

        //查询是否下单成功
        preorderExample preorderExample = new preorderExample();
        preorderExample.createCriteria().andPrepayIdEqualTo(prepay_id);
        List<preorder> preorders = preorderMapper.selectByExample(preorderExample);
        preorder preorder = preorders.get(0);
        Boolean flag = preorder.getFlag();


        JSONObject json = new JSONObject();
        if (flag){ // flag == true 为支付了订单
            singleResp select = singleService.select(index);

            json.put("phone", select.getPhone());
            json.put("wechat", select.getWechat());
            json.put("wish", select.getWish());
            json.put("region", select.getRegion());
            json.put("timestamp", select.getTimestamp());
            json.put("pic", select.getPic());

        }

        return json;
    }

    @RequestMapping("/getpic")
    // 可用  @RequestBody JSONObject jsonObject  接收
    // 可用  @RequestBody singleReq singleReq  接收
    public String getpic(@RequestBody JSONObject timestamp) {
        String selectpic = singleService.selectpic(timestamp.getString("timestamp"));

        return selectpic;
    }

    @RequestMapping("/admin-single")
    // 可用  @RequestBody JSONObject jsonObject  接收
    // 可用  @RequestBody singleReq singleReq  接收
    public CommonResp<List<single>> toufang() {
        CommonResp<List<single>> listCommonResp = singleService.admin_toufang();
        return listCommonResp;
    }

    @RequestMapping("/change_pic")
    public void change_pic(Long id){
        singleService.change_pic(id);
    }

    @RequestMapping("/delete_single")
    public void delete(Long id){
        singleService.delete(id);
    }
}
