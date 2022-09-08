package com.controller;

import com.service.runningService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
 class runningController {


    @Resource
    private runningService runningService;

    @RequestMapping("/running")
    public String running(String account,String password,String phone,String nickname, String avatarurl,Integer km,Integer money){
        String insert = runningService.insert(account, password, phone,nickname, avatarurl,km,money);
        return insert;
    }
}
