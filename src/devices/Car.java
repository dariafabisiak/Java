package devices;

import com.zadania.Human;
import com.zadania.Sellable;

public abstract class Car extends Device implements Sellable {
    private Double horsePower;
    private String color;
    private Double price;

    public Car(String model, String producer, int yearOfProduction, Double hp, String color, Double price) {
        super(model, producer, yearOfProduction);
        this.horsePower = hp;
        this.color = color;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Car tmp = (Car) o;

        return model == tmp.model &&
                producer == tmp.producer &&
                horsePower == tmp.horsePower &&
                color == tmp.color &&
                price == tmp.price;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.haveCar() == true && buyer.getSalary() > price) {
            buyer.setSalary(buyer.getSalary() - price);
            seller.setSalary(seller.getSalary() + price);
            Car tmp = seller.getCar();
            buyer.setCar(tmp);
            seller.setCar(null);
        }
    }

    public abstract void refuel();
}