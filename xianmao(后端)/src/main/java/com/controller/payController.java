package com.controller;

import com.domain.pay_order;
import com.service.payService;
import com.suplin.demo.resp.CommonResp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class payController {

    @Resource
    private payService payService;


    @RequestMapping("/pay")
    public String pay(pay_order pay_order){
        int insert = payService.insert(pay_order);
        if (insert>0){
            return "ok";
        }else {
            return "no";
        }
    }

    @RequestMapping("/ifpay")
    public int ifpay(String orderid){
        int insert = payService.select(orderid);
        if (insert>0){
            return 1;
        }else {
            return 0;
        }
    }


    @RequestMapping("/admin-pay")
    public CommonResp<List<pay_order>> admin(){
        CommonResp<List<pay_order>> listCommonResp = payService.admin_pay();
        return listCommonResp;
    }
}
