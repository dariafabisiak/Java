package com.zadania;
import devices.Car;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    Animal pet;
    private Car car;

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

    Car getCar() {
        return car;
    }

    void setCar(Car car) {
        double price = car.getPrice();
        if (salary > price) {
            this.car = car;
        } else if (salary > price / 12.0) {
            System.out.println("Maybe using loan, but actually chicks will be surprise.");
            this.car = car;
        } else {
            System.out.println("Can't buy. Maybe you should rebrand to be a programmer ?");
        }
    }

    @Override
    public String toString() {
        return Double.toString(salary);
    }
}
