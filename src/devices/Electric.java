package devices;

public class Electric extends Car{
    public Electric(String model, String producer, int yearOfProduction, Double hp, String color, Double price) {
        super(model, producer, yearOfProduction, hp, color, price);
    }

    @Override
    public void refuel() {
        System.out.println("Charging electricity...");
    }
}
