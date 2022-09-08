package com.service;

import com.alibaba.fastjson.JSONObject;
import com.domain.suggest;
import com.domain.user;
import com.domain.userExample;
import com.mapper.userMapper;
import com.suplin.demo.resp.CommonResp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userService {

    @Resource
    private userMapper userMapper;

    public CommonResp<user> login(JSONObject jsonObject){
        CommonResp<user> userCommonResp = new CommonResp<>();

        String loginName = jsonObject.getString("loginName");

        userExample userExample = new userExample();
        com.domain.userExample.Criteria criteria = userExample.createCriteria().andLoginNameEqualTo(loginName);

        List<user> users = userMapper.selectByExample(userExample);
        if (users.size() == 0){
            userCommonResp.setSuccess(false);
            userCommonResp.setMessage("账号不存在");
            return userCommonResp;
        }else {
            String password = jsonObject.getString("password");

            criteria.andPasswordEqualTo(password);
            List<user> users1 = userMapper.selectByExample(userExample);

            if (users1.size() == 0){
                userCommonResp.setSuccess(false);
                userCommonResp.setMessage("密码错误");
                return userCommonResp;
            }else {
                userCommonResp.setContent(users1.get(0));
                return userCommonResp;
            }
        }


    }
}
