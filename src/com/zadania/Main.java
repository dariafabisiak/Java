package com.zadania;

import devices.Car;

public class Main {

    public static void main(String[] args) {
        Human h = new Human();
        h.setSalary(5000);

        Car car = new Car("S" ,"Tesla", 422.0, "Red", 24000.0);
        System.out.println(car.toString());
        h.setCar(car);
        Car a = new Car("S" ,"Tesla", 422.0, "Red", 120000.0);
        Car b = new Car("S", "Tesla", 422.0, "Red", 120000.0);
        System.out.println(a.equals(b));
        System.out.println(a);
        System.out.println(b);
        System.out.println(h.toString());
    }
}
