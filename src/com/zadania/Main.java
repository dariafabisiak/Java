package com.zadania;

import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pet p = new Pet("husky");
        p.feed(2.0);

        FarmAnimal f = new FarmAnimal("alpaki");
        f.feed(2.0);

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Diesel("X4", "BMW", 2020,333.0,"Black", 249000.0));
        cars.add(new Electric("S", "Tesla", 2021,885.0,"Gray", 275000.0));
        cars.add(new LPG("D", "MAZDA", 2018,188.0,"Red", 129000.0));

        for (Car c:cars) { c.refuel(); }

        Phone phone = new Phone("MATE 40", "HUAWEI", 2018);
        ArrayList<String> list = new ArrayList<String>();

        list.add("My app name 1");
        list.add("My app name 2");
        list.add("My app name 3");

        phone.installAnnApp("My app name");
        phone.installAnnApp("My app name", "2.0.11.3");
        phone.installAnnApp(list);
        try {
            phone.installAnnApp(new URL("ftp://someaddress.com/app.apk"));
            phone.installAnnApp("My app name", "2.0.11.3", new URL("ftp://someaddress.com/app.apk"));
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
