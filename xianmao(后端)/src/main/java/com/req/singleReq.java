package com.req;

import org.springframework.stereotype.Service;

@Service
public class singleReq {

    private String sex;

    private String phone;

    private String wechat;

    private String wish;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", wechat=").append(wechat);
        sb.append(", wish=").append(wish);
        sb.append("]");
        return sb.toString();
    }
}