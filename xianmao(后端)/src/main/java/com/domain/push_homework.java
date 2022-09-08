package com.domain;

import org.springframework.stereotype.Service;

@Service
public class push_homework {
    private Long id;

    private String workname;

    private Integer money;

    private String classname;

    private String schoolname;

    private String phone;

    private String username;

    private String worktime;

    private Integer flag;

    private String homework;

    private String pushopenid;

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

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    public String getPushopenid() {
        return pushopenid;
    }

    public void setPushopenid(String pushopenid) {
        this.pushopenid = pushopenid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workname=").append(workname);
        sb.append(", money=").append(money);
        sb.append(", classname=").append(classname);
        sb.append(", schoolname=").append(schoolname);
        sb.append(", phone=").append(phone);
        sb.append(", username=").append(username);
        sb.append(", worktime=").append(worktime);
        sb.append(", flag=").append(flag);
        sb.append(", homework=").append(homework);
        sb.append(", pushopenid=").append(pushopenid);
        sb.append("]");
        return sb.toString();
    }
}