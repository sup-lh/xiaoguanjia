package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.domain.preorder;
import com.domain.preorderExample;
import com.mapper.preorderMapper;
import com.resp.helpResp;
import com.resp.myhelpResp;
import com.resp.pushhelpResp;
import com.service.helpService;
import com.util.getopenid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.text.ParseException;
import java.util.List;


@RestController
public class helpController {

    @Resource
    private helpService helpService;


    @Resource
    private preorderMapper preorderMapper;


    @RequestMapping("/pushhelp")
    public boolean pushhelp(@RequestBody JSONObject jsonObject) throws ParseException {
        Object code = jsonObject.get("code");
        String openid = new getopenid().openid((String)code);
        int insert = helpService.insert(openid, jsonObject);
        if (insert>0){
            return true;
        }else {
            return false;
        }
    }

    @RequestMapping("/gethelp")
    public List<helpResp> gethelp() throws ParseException {
        List<helpResp> select = helpService.select();
        return select;
    }


    @RequestMapping("/ifhelped")
    public boolean ifhelped(@RequestBody JSONObject jsonObject) {
        Long id = jsonObject.getLong("id");

        boolean selectflag = helpService.selectflag(id);

        return selectflag;
    }


    @RequestMapping("/overhelp")
    public boolean overhelp(@RequestBody JSONObject jsonObject) {
        Long id = jsonObject.getLong("id");

        boolean selectflag = helpService.updateover(id);

        return selectflag;
    }

    @RequestMapping("/deletehelp")
    public boolean deletehelp(@RequestBody JSONObject jsonObject) {
        Long id = jsonObject.getLong("id");

        boolean selectflag = helpService.deletehelp(id);

        return selectflag;
    }



    @RequestMapping("/getmypushhelp")
    public List<pushhelpResp> getmypushhelp(@RequestBody JSONObject jsonObject)  {
        String code = jsonObject.getString("code");
        String pushopenid = new getopenid().openid(code);

        List<pushhelpResp> selectmine = helpService.selectmine(pushopenid);
        return selectmine;
    }


    @RequestMapping("/getminehelp")
    public List<myhelpResp> getminehelp(@RequestBody JSONObject jsonObject)  {
        String code = jsonObject.getString("code");
        String gainopenid = new getopenid().openid(code);

        List<myhelpResp> selectminehelp = helpService.selectminehelp(gainopenid);

        return selectminehelp;
    }



    @RequestMapping("/updatehelp")
    public String updatehelp(@RequestBody JSONObject jsonObject)  {

        Long id = jsonObject.getLong("id");
        String gainphone = jsonObject.getString("gainphone");
        String code = jsonObject.getString("code");
        String gainopenid = new getopenid().openid(code);

        String prepay_id = jsonObject.getString("prepay_id");
        //查询是否下单成功
        preorderExample preorderExample = new preorderExample();
        preorderExample.createCriteria().andPrepayIdEqualTo(prepay_id);
        List<preorder> preorders = preorderMapper.selectByExample(preorderExample);
        preorder preorder = preorders.get(0);
        Boolean flag = preorder.getFlag();

        if (flag){
            String updatehelp = helpService.updatehelp(id,gainopenid,gainphone);
            return updatehelp;
        }
        return null;

    }

}
