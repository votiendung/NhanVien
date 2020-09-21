package com.codegym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Staff> employeeList = new ArrayList<>();
        employeeList.add(new StaffFullTime(1, "vu thi kieu anh", 27, "0988543789", "vuthikieuanh@gmail.com", 300));
        employeeList.add(new StaffFullTime(2, "greenrood", 28, "0987666888", "greenrood@gmail.com", 500));
        employeeList.add(new StaffFullTime(3, "kieu thi duyen", 24, "0973456789", "kieuthiduyen@gmail.com", 700));
        employeeList.add(new StaffPartTime(4, "imbramovic", 27, "0908989666", "imbramovic@gmail.com"));
        employeeList.add(new StaffPartTime(5, "rikatic", 27, "0903893789", "rikatic@gmail.com"));

        Main main = new Main();
//        main.addEmployee(employeeList);
//
//        for(int i = 0; i< employeeList.size(); i++) {
//            System.out.println(employeeList.get(i));
//        }

        main.avgWage(employeeList);
        double avg = main.avgWage(employeeList);
        for (Staff staff: employeeList){
            if (staff instanceof StaffFullTime) {
                if (((StaffFullTime) staff).getSalary()>=avg) {
                    System.out.println(staff);
                }
            }
        }


    }
        public void addEmployee(List<Staff> employeeList) {
            double employeeCode = 0;
            String fullName;
            int age;
            String numberPhone;
            String email;
            double salary;
            int type;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Them Nhan vien FullTime nhap so 1, nhan vien PartTime nhap so 2.");
            type = scanner.nextInt();
            System.out.println("Nhap vao ten nhan vien :");
            scanner.nextLine();
            fullName = scanner.nextLine();
            System.out.println("Nhap vao tuoi :");
            age = scanner.nextInt();
            System.out.println("Nhap vao so dien thoai :");
            scanner.nextLine();
            numberPhone = scanner.nextLine();
            System.out.println("Nhap vao email :");
            email = scanner.nextLine();
            System.out.println("Nhap vao luong :");
            salary = scanner.nextLong();

            if (type==1) {
             Staff staff = new StaffFullTime(employeeCode, fullName, age, numberPhone, email, salary);
                employeeList.add(staff);
            }else if (type ==2) {
                Staff staff = new StaffPartTime(employeeCode, fullName, age, numberPhone, email);
                employeeList.add(staff);

            }


        }
        public double avgWage(List<Staff> employeeList){

        Scanner scanner = new Scanner(System.in);
        int index=0;
        double totalSalary=0;
        for (Staff staff: employeeList) {
            if (staff instanceof StaffFullTime){
                index++;

                double bonus;
                double fine;
                System.out.println("nhap tien thuong: ");
                ((StaffFullTime) staff).setBonus((long) (bonus = scanner.nextDouble()));

                System.out.println("nhap tien phat: ");
                ((StaffFullTime) staff).setBonus((long) (fine = scanner.nextDouble()));

                totalSalary += ((StaffFullTime) staff).foodField();
            }
            else if (staff instanceof StaffPartTime) {
                double time;
                System.out.println("nhap thoi gian");
                ((StaffPartTime) staff).setTime((long) (time = scanner.nextDouble()));
            }
        }

        return totalSalary/index;

        }









//        public Staff StaffLowSalaryList(List<Staff> employees){
//            Scanner scanner = new Scanner(System.in);
//            double totalSalary = 0;
//            for (Staff staff : employees){
//                if (staff instanceof StaffFullTime){
//                    double bonus;
//                    double forfeit;
//                    System.out.println("Nhap vao tien thuong cua nhan vien "+ staff.getId() + " : ");
//                    bonus = scanner.nextDouble();
//                    ((StaffFullTime) staff).setBonus((double) bonus);
//                    System.out.println("Nhap vao tien phat cua nhan vien "+ staff.getId() + " : ");
//                    forfeit = scanner.nextDouble();
//                    ((StaffFullTime) staff).setFine(fine);
//                    ((StaffFullTime) staff).setSalary(((StaffFullTime) staff).getSalary()-(((StaffFullTime) staff).getBonus()-((StaffFullTime) staff).getForfeit()));
//                    totalSalary += ((StaffFullTime) staff).getSalary();
//                }else if (staff instanceof StaffFullTime){
//                    int workTime;
//                    System.out.println("Nhap vao so gio lam cua nhan vien "+ staff.getId() + " : ");
//                    workTime = scanner.nextInt();
//                    ((StaffFullTime) staff).setWorkTime(workTime);
//                    totalSalary += ((StaffFullTime) staff).getRealSalary();
//                }
//            }
//            return totalSalary;
//        }
//


}
