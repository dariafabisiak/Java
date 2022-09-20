package com.zadania;

import devices.Car;

public class Main {

    public static void main(String[] args) {
        Car a = new Car("S", "Tesla", 422, 120000.0, "Red", 2000.0);

        Human h1 = new Human();
        Human h2 = new Human();
        h1.setSalary(10000);
        h2.setCar(a);
        System.out.println(h2.getCar().toString());

        a.sell(h2,h1,100.0);
        System.out.println(h1.getCar().toString());
        h1.getSalary();
        h2.getSalary();
    }
}
