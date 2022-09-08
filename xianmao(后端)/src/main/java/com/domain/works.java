package com.domain;

import org.springframework.stereotype.Service;

@Service
public class works {
    private Long id;

    private Long pushId;

    private String pushOpenid;

    private String gainOpenid;

    private String commitFlag;

    private String zhifubao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPushId() {
        return pushId;
    }

    public void setPushId(Long pushId) {
        this.pushId = pushId;
    }

    public String getPushOpenid() {
        return pushOpenid;
    }

    public void setPushOpenid(String pushOpenid) {
        this.pushOpenid = pushOpenid;
    }

    public String getGainOpenid() {
        return gainOpenid;
    }

    public void setGainOpenid(String gainOpenid) {
        this.gainOpenid = gainOpenid;
    }

    public String getCommitFlag() {
        return commitFlag;
    }

    public void setCommitFlag(String commitFlag) {
        this.commitFlag = commitFlag;
    }

    public String getZhifubao() {
        return zhifubao;
    }

    public void setZhifubao(String zhifubao) {
        this.zhifubao = zhifubao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pushId=").append(pushId);
        sb.append(", pushOpenid=").append(pushOpenid);
        sb.append(", gainOpenid=").append(gainOpenid);
        sb.append(", commitFlag=").append(commitFlag);
        sb.append(", zhifubao=").append(zhifubao);
        sb.append("]");
        return sb.toString();
    }
}