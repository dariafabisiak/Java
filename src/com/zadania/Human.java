package com.zadania;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    Animal pet;
    Car car;

    private double salary = 0;

    Human()
    {}

    double getSalary() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Dane zostaly pobrane : " + formatter.format(date));
        System.out.println("Wartosc twojej wyplaty to: " + salary);
        return salary;
    }

    void setSalary(double salary) {
        if (salary < 0) {
            return;
        }
        System.out.println("Update your profile");
        System.out.println("Collect personal information from Pani Halinka in building called Kadry");
        System.out.println("ZUS & US know about your to higher salary than normal people. You should worry about that.");
        this.salary = salary;
    }
}
