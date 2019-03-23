package com.github.softeasyzhang.dingrobot.entity;

public class Employee {

    private String name;
    private String dingNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDingNo() {
        return dingNo;
    }

    public void setDingNo(String dingNo) {
        this.dingNo = dingNo;
    }

    public Employee(String name, String dingNo) {
        this.name = name;
        this.dingNo = dingNo;
    }
}
