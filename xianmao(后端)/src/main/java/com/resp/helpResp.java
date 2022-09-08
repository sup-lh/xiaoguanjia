package com.resp;


import java.util.Date;

public class helpResp {
    private Long id;

    private String thing;

    private String date;
    
    private Date time;

    private String start;

    private String end;

    private Integer money;

    private String touxiang;

    private Boolean thingflag;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", thing=").append(thing);
        sb.append(", date=").append(date);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", money=").append(money);
        sb.append(", touxiang=").append(touxiang);
        sb.append(", thingflag=").append(thingflag);
        sb.append(", time=").append(time);
        sb.append(", date=").append(date);
        sb.append("]");
        return sb.toString();
    }
}