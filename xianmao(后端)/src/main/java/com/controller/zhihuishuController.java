package com.controller;
import com.alibaba.fastjson.JSONObject;
import com.domain.preorder;
import com.domain.preorderExample;
import com.mapper.preorderMapper;
import com.service.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class zhihuishuController {

    @Resource
    private zhihuishuService zhihuishuService;


    @Resource
    private preorderMapper preorderMapper;


    @RequestMapping("/zhihuishu")
    public int zhihuishu(@RequestBody JSONObject jsonObject){
        JSONObject json1 = jsonObject.getJSONObject("data_form1");
        JSONObject json2 = jsonObject.getJSONObject("data_form2");
        String prepay_id = jsonObject.getString("prepay_id");

        //查询是否下单成功
        preorderExample preorderExample = new preorderExample();
        preorderExample.createCriteria().andPrepayIdEqualTo(prepay_id);
        List<preorder> preorders = preorderMapper.selectByExample(preorderExample);
        preorder preorder = preorders.get(0);
        Boolean flag = preorder.getFlag();
        if (flag){

            String account = json2.getString("account");
            String password = json2.getString("password");
            String phone = json2.getString("phone");
            String nickname = json1.getString("nickname");
            String avatarurl = json1.getString("avatarurl");

            int insert = zhihuishuService.insert(account, password, phone,nickname, avatarurl);
            return insert;
        }
        return 0;
    }


}