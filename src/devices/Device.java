package devices;

public abstract class Device {
    final String model;
    final String producer;
    final int yearOfProduction;

    Device(String model, String producer, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "{\n " + model + "\n " + producer + "\n " + yearOfProduction + "\n}";
    }
}