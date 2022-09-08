package com.domain;

import org.springframework.stereotype.Service;

@Service
public class single {
    private Long id;

    private String sex;

    private String phone;

    private String wechat;

    private String wish;

    private String region;

    private String pic;

    private String timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", wechat=").append(wechat);
        sb.append(", wish=").append(wish);
        sb.append(", region=").append(region);
        sb.append(", pic=").append(pic);
        sb.append(", timestamp=").append(timestamp);
        sb.append("]");
        return sb.toString();
    }
}