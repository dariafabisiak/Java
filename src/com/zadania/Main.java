package com.zadania;

import creatures.FarmAnimal;
import creatures.Pet;
import devices.Car;

public class Main {

    public static void main(String[] args) {
        Pet p = new Pet("husky");
        p.feed(2.0);

        FarmAnimal f = new FarmAnimal("alpaki");
        f.feed(2.0);
    }
}
