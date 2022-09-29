package devices;

public class LPG extends Car {

    public LPG(String model, String producer, int yearOfProduction, Double hp, String color, Double price) {
        super(model, producer, yearOfProduction, hp, color, price);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling LPG...");
    }
}
