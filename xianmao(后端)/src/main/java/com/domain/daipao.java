package com.domain;

import org.springframework.stereotype.Service;

@Service
public class daipao {
    private Long id;

    private String wechat;

    private String km;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wechat=").append(wechat);
        sb.append(", km=").append(km);
        sb.append("]");
        return sb.toString();
    }
}