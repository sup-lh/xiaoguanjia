package com.domain;

import org.springframework.stereotype.Service;

@Service
public class running {
    private Long id;

    private Integer km;

    private Integer money;

    private String account;

    private String password;

    private String phone;

    private String nickname;

    private String avatarurl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", km=").append(km);
        sb.append(", money=").append(money);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", nickname=").append(nickname);
        sb.append(", avatarurl=").append(avatarurl);
        sb.append("]");
        return sb.toString();
    }
}