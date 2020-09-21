package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private double employeeCode;
    private String fullName;
    private int age;
    private String numberPhone;
    private String email;

    public Staff() {
    }

    public Staff(double employeeCode, String fullName, int age, String numberPhone, String email) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.age = age;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public double getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(double employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "employeeCode=" + employeeCode +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' ;

    }
}
