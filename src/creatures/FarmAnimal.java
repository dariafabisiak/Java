package creatures;


public class FarmAnimal extends Animal implements Edbile {
    public FarmAnimal(String spiecies) {
        super(spiecies);
    }

    public void beEaten() {
        System.out.println("Be eaten!");
    }

    @Override
    public void feed(double foodWeight) {
        weight += foodWeight;
    }
}