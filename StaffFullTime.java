package com.codegym;

public class StaffFullTime extends Staff {
    private double bonus;
    private double fine;
    private double salary;

    public double foodField(){
        return getSalary()+ getBonus() - getFine();
    }

    public StaffFullTime(double bonus, double fine, double salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public StaffFullTime(double employeeCode, String fullName, int age, String numberPhone, String email, double salary) {
        super(employeeCode, fullName, age, numberPhone, email);
        this.salary = salary;
    }



    public double getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(long fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "StaffFull " + super.toString() + " salary= " + salary;

    }
}
