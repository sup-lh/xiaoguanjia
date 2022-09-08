package com.service;

import com.domain.zhihuishu;
import com.mapper.zhihuishuMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class zhihuishuService {
    @Resource
    private zhihuishu zhihuishu;
    @Resource
    private zhihuishuMapper zhihuishuMapper;

    public int insert(String account,String password,String phone,String nickname, String avatarurl){
        zhihuishu.setAccount(account);
        zhihuishu.setPassword(password);
        zhihuishu.setPhone(phone);
        zhihuishu.setNickname(nickname);
        zhihuishu.setAvatarurl(avatarurl);


        int row = zhihuishuMapper.insert(zhihuishu);
        if (row != 0 ){
            return 1;
        }else {
            return 0;
        }


    }
}
