package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.domain.user;
import com.resp.singleResp;
import com.service.singleService;
import com.service.userService;
import com.suplin.demo.resp.CommonResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class userController {

    @Autowired
    private com.service.userService userService;


    @RequestMapping("/user/login")
    // 可用  @RequestBody JSONObject jsonObject  接收
    // 可用  @RequestBody singleReq singleReq  接收
    public CommonResp<user> single(@RequestBody JSONObject jsonObject) {
        System.out.println("管理员登录");
        CommonResp<user> login = userService.login(jsonObject);
        return login;
    }

}
