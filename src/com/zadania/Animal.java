package com.zadania;

public class Animal {
    final String species;
    private Double weight;

    Animal(String species) {
        this.species = species;
        switch (this.species)
        {
            case "mysz":
                this.weight = 0.5;
                break;
        }
    }

    public void feed() {
        if (weight == 0) {
            System.out.println("Pet's died. Can't feed.");
        } else {
            weight += 0.5;
        }

    }

    void takeForAWalk() {
        final double x = 0.5;
        if (weight - x <= 0.0) {
            weight = 0.0;
            System.out.println("Pet's died.");
        } else {
            weight -= x;
        }
    }

    @Override
    public String toString() {
        return species + " " + weight;
    }
}
