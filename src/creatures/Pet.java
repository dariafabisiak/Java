package creatures;

public class Pet extends Animal {

    public Pet(String spiecies){
        super(spiecies);

    }

    @Override
    public void feed(double foodWeight) {
        this.weight += foodWeight;
    }
}