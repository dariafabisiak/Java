package com.zadania;
import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    Animal pet;
    private Car[] garage;
    private Phone phone;
    double cash;

    private double salary = 0;

    Human() {
        this.garage = new Car[2];
    }


    Human(int garageSize) {
        this.garage = new Car[garageSize];
    }

    public double getSalary() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Dane zostaly pobrane : " + formatter.format(date));
        System.out.println("Wartosc twojej wyplaty to: " + salary);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            return;
        }
        System.out.println("Update your profile");
        System.out.println("Collect personal information from Pani Halinka in building called Kadry");
        System.out.println("ZUS & US know about your to higher salary than normal people. You should worry about that.");
        this.salary = salary;
    }

    public Car[] getGarage() {
        return garage;
    }

    public void setGarage(Car[] garage) {
        this.garage = garage;
    }

    public Car getCar(int garageIndex) {
        if (garageIndex < 0 || garageIndex >= garage.length) {
            throw new IndexOutOfBoundsException("Invalid garage index: " + garageIndex);
        }
        return garage[garageIndex];
    }

    public void setCar(int garageIndex, Car car) {
        if (garageIndex < 0 || garageIndex >= garage.length) {
            throw new IndexOutOfBoundsException("Invalid garage index: " + garageIndex);
        }
        garage[garageIndex] = car;
    }
    public double getGarageValue() {
        double sum = 0;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] != null) {
                sum += garage[i].value;
            }
        }
        return sum;
    }

    public void setAnimal(Animal a){
        pet = a;
    }

    @Override
    public String toString() {
        return Double.toString(salary);
    }


    public boolean havePhone() {
        return phone != null;
    }

    public boolean haveAnimal() {
        return pet != null;
    }

    public Animal getAnimal() {
        return pet;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
