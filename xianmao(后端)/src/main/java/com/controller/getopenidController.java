package com.controller;

import com.domain.advertising;
import com.domain.advertisingExample;
import com.domain.version;
import com.domain.versionExample;
import com.mapper.advertisingMapper;
import com.mapper.versionMapper;
import com.resp.advertisingResp;
import com.util.CopyUtil;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController

public class getopenidController {

    OkHttpClient client = new OkHttpClient();

    @Resource
    private versionMapper versionMapper;

    @Resource
    private advertisingMapper advertisingMapper;



    @RequestMapping("/openid")
    public String openid(String code) throws IOException {
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        url += "?appid=wx7a4566c3df923557";//自己的appid
        url += "&secret=d59651e120f6a83182e73663ef21b30c";//自己的appSecret
        url += "&js_code=" + code;
        url += "&grant_type=authorization_code";
        url += "&connect_redirect=1";

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String resp = response.body().string();
            return resp;
        }
    }

    @RequestMapping("/version")
    public int version() {
        versionExample versionExample = new versionExample();
        versionExample.createCriteria().andIdEqualTo(1);
        List<version> versions = versionMapper.selectByExample(versionExample);
        Integer version = versions.get(0).getVersion();
        if (version == 1){
            System.out.println("正常访问");
        }else {
            System.out.println("测试");
        }
        return version;
    }

    @RequestMapping("/advertising")
    public List<advertisingResp>  advertising() {
        advertisingExample advertisingExample = new advertisingExample();
        advertisingExample.createCriteria().andDataIsNotNull();
        List<advertising> advertisings = advertisingMapper.selectByExample(advertisingExample);
        List<advertisingResp> advertisingResps = CopyUtil.copyList(advertisings, advertisingResp.class);
        return advertisingResps;
    }

}
