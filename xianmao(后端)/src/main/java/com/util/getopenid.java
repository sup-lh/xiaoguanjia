package com.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class getopenid {

    OkHttpClient client = new OkHttpClient();




    public String openid(String code) {

        String openid = null;

        System.out.println("code:" + code);
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        url += "?appid=wx945ba2084b0adafe";//自己的appid
        url += "&secret=693c50377a88c6e627e0749189c2d2d2";//自己的appSecret
        url += "&js_code=" + code;
        url += "&grant_type=authorization_code";

        Request request = new Request.Builder()
                .url(url)
                .build();


        try (Response response = client.newCall(request).execute()) {
            String resp = response.body().string();
            System.out.println("返回内容" + resp);
            String[] openids = resp.split("openid\":\"");
            String[] resps = openids[1].split("\"}");
            openid = resps[0];
            return openid;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openid;
    }
}
