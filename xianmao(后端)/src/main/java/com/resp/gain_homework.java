package com.resp;

import org.springframework.stereotype.Service;

@Service
public class gain_homework {
    private Integer flag;

    private String phone;

    private Long id;

    private String workname;

    private String homework;

    private Integer money;

    private String schoolname;

    private String classname;

    private String worktime;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
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


    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    @Override
    public String toString() {
        return "gain_homework{" +
                "flag='" + flag + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", workname='" + workname + '\'' +
                ", homework='" + homework + '\'' +
                ", money=" + money +
                ", schoolname='" + schoolname + '\'' +
                ", classname='" + classname + '\'' +
                ", worktime='" + worktime + '\'' +
                '}';
    }
}