package com.web.entities;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Employee {

	private Integer workNum;
    private String lastName;

    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "workNum=" + workNum +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", department=" + department +
                ", birth=" + birth +
                ", dId=" + dId +
                '}';
    }

    public Integer getWorkNum() {
        return workNum;
    }

    public void setWorkNum(Integer workNum) {
        this.workNum = workNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    //1 male, 0 female
    private Integer gender;
    private Department department;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    private int dId;


}
