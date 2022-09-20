package com.zadania;

public class Main {

    public static void main(String[] args) {
        Animal pet = new Animal("mysz");
        Human h = new Human();
        h.pet = pet;
        h.car = new Car("S" ,"Tesla", 422.0, "Red", 120000.0);
    }
}
