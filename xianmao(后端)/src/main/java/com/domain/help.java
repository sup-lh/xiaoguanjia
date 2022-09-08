package com.domain;

import java.util.Date;

public class help {
    private Long id;

    private String thing;

    private Date time;

    private String start;

    private String end;

    private Integer money;

    private String touxiang;

    private Boolean thingflag;

    private String pushopenid;

    private String gainopenid;

    private String phone;

    private String gainphone;

    private Boolean over;

    private Boolean deleteflag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
    }

    public Boolean getThingflag() {
        return thingflag;
    }

    public void setThingflag(Boolean thingflag) {
        this.thingflag = thingflag;
    }

    public String getPushopenid() {
        return pushopenid;
    }

    public void setPushopenid(String pushopenid) {
        this.pushopenid = pushopenid;
    }

    public String getGainopenid() {
        return gainopenid;
    }

    public void setGainopenid(String gainopenid) {
        this.gainopenid = gainopenid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGainphone() {
        return gainphone;
    }

    public void setGainphone(String gainphone) {
        this.gainphone = gainphone;
    }

    public Boolean getOver() {
        return over;
    }

    public void setOver(Boolean over) {
        this.over = over;
    }

    public Boolean getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Boolean deleteflag) {
        this.deleteflag = deleteflag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", thing=").append(thing);
        sb.append(", time=").append(time);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", money=").append(money);
        sb.append(", touxiang=").append(touxiang);
        sb.append(", thingflag=").append(thingflag);
        sb.append(", pushopenid=").append(pushopenid);
        sb.append(", gainopenid=").append(gainopenid);
        sb.append(", phone=").append(phone);
        sb.append(", gainphone=").append(gainphone);
        sb.append(", over=").append(over);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append("]");
        return sb.toString();
    }
}