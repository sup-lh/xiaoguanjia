package com.resp;


import java.util.Date;

public class pushhelpResp {
    private Long id;

    private String thing;

    private String date;
    
    private Date time;

    private String start;

    private String end;

    private Integer money;

    private Boolean thingflag;

    private String gainphone;

    public String getGainphone() {
        return gainphone;
    }

    public void setGainphone(String gainphone) {
        this.gainphone = gainphone;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

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


    public Boolean getThingflag() {
        return thingflag;
    }

    public void setThingflag(Boolean thingflag) {
        this.thingflag = thingflag;
    }

    @Override
    public String toString() {
        return "pushhelpResp{" +
                "id=" + id +
                ", thing='" + thing + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", money=" + money +
                ", thingflag=" + thingflag +
                ", gainphone='" + gainphone + '\'' +
                '}';
    }
}