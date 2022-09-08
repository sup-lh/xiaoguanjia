package com.resp;

import org.springframework.stereotype.Service;

@Service
public class gain_commit_page {
    private Long id;

    private String workname;

    private Integer money;

    private String classname;

    private String schoolname;

    private String worktime;

    private String homework;

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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workname=").append(workname);
        sb.append(", money=").append(money);
        sb.append(", classname=").append(classname);
        sb.append(", schoolname=").append(schoolname);
        sb.append(", homework=").append(homework);
        sb.append("]");
        return sb.toString();
    }
}