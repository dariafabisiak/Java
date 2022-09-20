package com.zadania;

public class Main {

    public static void main(String[] args) {
        Human h = new Human();
        h.setSalary(5000);

        Car car = new Car("S" ,"Tesla", 422.0, "Red", 24000.0);
        h.setCar(car);
    }
}
