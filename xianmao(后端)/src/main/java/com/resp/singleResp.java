package com.resp;

import org.springframework.stereotype.Service;

@Service
public class singleResp {

    private String timestamp;

    private String pic;

    private String region;

    private String phone;

    private String wechat;

    private String wish;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    @Override
    public String toString() {
        return "singleResp{" +
                "timestamp='" + timestamp + '\'' +
                ", pic='" + pic + '\'' +
                ", region='" + region + '\'' +
                ", phone='" + phone + '\'' +
                ", wechat='" + wechat + '\'' +
                ", wish='" + wish + '\'' +
                '}';
    }
}