package devices;

import com.zadania.Human;
import com.zadania.Sellable;

public abstract class Car extends Device implements Sellable {
    private Double horsePower;
    private String color;
    private Double price;

    public Car(String model, String producer, int yearOfProduction, Double hp, String color, Double price) {
        super(model, producer, yearOfProduction, price);
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
        boolean foundCar = false;
        int sellerCarIndex = -1;
        for (int i = 0; i < seller.getGarage().length; i++) {
            if (seller.getCar(i) != null && seller.getCar(i).equals(this)) {
                foundCar = true;
                sellerCarIndex = i;
                break;
            }
        }
        if (!foundCar) {
            throw new IllegalArgumentException("Seller does not own this car");
        }
        int buyerFreeGarageIndex = -1;
        for (int i = 0; i < buyer.getGarage().length; i++) {
            if (buyer.getCar(i) == null) {
                buyerFreeGarageIndex = i;
                break;
            }
        }
        if (buyerFreeGarageIndex == -1) {
            throw new IllegalArgumentException("Buyer does not have a free garage slot");
        }
        if (buyer.getSalary() < price) {
            throw new IllegalArgumentException("Buyer does not have enough money to buy the car");
        }
        Car carToSell = seller.getCar(sellerCarIndex);
        seller.setCar(sellerCarIndex, null);
        buyer.setCar(buyerFreeGarageIndex, carToSell);
        buyer.setSalary(buyer.getSalary() - price);
        seller.setSalary(seller.getSalary() + price);
        System.out.println("Transaction completed successfully");
        }

    public abstract void refuel();
}