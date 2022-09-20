package com.zadania;

public class Car {
    final String model;
    final String producer;
    private Double horsePower;
    private String color;
    private Double price;

    Car (String model, String producer, Double hp, String color, Double price) {
        this.model = model;
        this.producer = producer;
        this.horsePower = hp;
        this.color = color;
        this.price = price;
    }
}