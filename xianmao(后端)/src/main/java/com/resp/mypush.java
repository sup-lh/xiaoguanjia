package com.resp;

import org.springframework.stereotype.Service;

@Service
public class mypush {

    private Integer flag;


    private Long id;

    private String workname;

    private Integer money;

    private String classname;

    private String worktime;


    @Override
    public String toString() {
        return "mypush{" +
                "flag='" + flag + '\'' +
                ", id=" + id +
                ", workname='" + workname + '\'' +
                ", money=" + money +
                ", classname='" + classname + '\'' +
                ", worktime='" + worktime + '\'' +
                '}';
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }



}
