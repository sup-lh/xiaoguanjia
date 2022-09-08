package com.resp;


import java.util.Date;

public class myhelpResp {

    private String thing;

    private String date;
    
    private Date time;

    private String start;

    private String end;

    private Integer money;

    private String touxiang;

    private String phone;

    @Override
    public String toString() {
        return "myhelpResp{" +
                "thing='" + thing + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", money=" + money +
                ", touxiang='" + touxiang + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
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



}