package com.service;

import com.domain.running;
import com.mapper.runningMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class runningService {
    @Resource
    private running running;
    @Resource
    private runningMapper runningMapper;

    public String insert(String account,String password,String phone,String nickname, String avatarurl,Integer km,Integer money){
        running.setAccount(account);
        running.setPassword(password);
        running.setPhone(phone);
        running.setKm(km);
        running.setMoney(money);
        running.setNickname(nickname);
        running.setAvatarurl(avatarurl);


        int row = runningMapper.insert(running);
        if (row != 0 ){
            return "数据插入成功";
        }else {
            return "数据插入失败";
        }


    }
}
