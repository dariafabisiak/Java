package devices;

public abstract class Device {
    final String model;
    final String producer;
    final int yearOfProduction;
    public final Double value;
    Device(String model, String producer, int yearOfProduction, Double value) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "{\n " + model + "\n " + producer + "\n " + yearOfProduction + "\n}";
    }
}