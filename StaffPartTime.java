package com.codegym;

public class StaffPartTime extends Staff {
    private long time;

    public static final int overtimeMoney = 100;
    public long foodField() {
        return getTime()* overtimeMoney;
    }


    public StaffPartTime(long time) {
        this.time = time;
    }

    public StaffPartTime(double manhanvien, String hoTen, int tuoi, String telephone, String email) {
        super(manhanvien, hoTen, tuoi, telephone, email);
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
