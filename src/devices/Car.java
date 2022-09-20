package devices;

public class Car {
    final String model;
    final String producer;
    private Double horsePower;
    private String color;
    private Double price;

    public Car(String model, String producer, Double hp, String color, Double price) {
        this.model = model;
        this.producer = producer;
        this.horsePower = hp;
        this.color = color;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return model + " " + producer + " " + horsePower + " " + color + " " + price;
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
}