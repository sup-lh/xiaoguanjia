package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.domain.daipao;
import com.domain.preorder;
import com.domain.preorderExample;
import com.mapper.preorderMapper;
import com.resp.singleResp;
import com.service.daiapoService;
import com.service.singleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class daipaoController {

    @Resource
    private daiapoService daiapoService;


    @Resource
    private preorderMapper preorderMapper;


    @RequestMapping("/savekm")
    public int savekm(@RequestBody JSONObject jsonObject){
        int insert = daiapoService.insert(jsonObject);
        if (insert>0){
            return 1;
        }else {
            return 0;
        }
    }

    @RequestMapping("/getdaipao")
    // 可用  @RequestBody JSONObject jsonObject  接收
    // 可用  @RequestBody singleReq singleReq  接收
    public ArrayList<JSONObject>  getdaipao() {

        ArrayList<JSONObject> arrayList = new ArrayList();
        List<daipao> select = daiapoService.select();

        for (daipao daipao : select) {
            JSONObject json = new JSONObject();
            json.put("km",daipao.getKm());
            json.put("wechat",daipao.getWechat());
            json.put("id",daipao.getId());
            arrayList.add(json);
        }

        return arrayList;
    }


    @RequestMapping("/getdaipaoafter")
    // 可用  @RequestBody JSONObject jsonObject  接收
    // 可用  @RequestBody singleReq singleReq  接收
    public String  getdaipaoafter(@RequestBody JSONObject jsonObject) {

        Long id = jsonObject.getLong("id");
        String prepay_id = jsonObject.getString("prepay_id");

        //查询是否下单成功
        preorderExample preorderExample = new preorderExample();
        preorderExample.createCriteria().andPrepayIdEqualTo(prepay_id);
        List<preorder> preorders = preorderMapper.selectByExample(preorderExample);
        preorder preorder = preorders.get(0);
        Boolean flag = preorder.getFlag();


        if (flag) {
            String wechat = daiapoService.select_id(id);

            return wechat;

        }else {
            return null;
        }

    }



}
