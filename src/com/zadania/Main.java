package com.zadania;

import devices.Car;

public class Main {

    public static void main(String[] args) {
        Car a = new Car("S", "Tesla", 422, 120000.0, "Red", 2000.0);
        Car b = new Car("S", "Tesla", 422, 120000.0, "Red", 2000.0);
        System.out.println(a.toString());
        a.turnOn();
    }
}
