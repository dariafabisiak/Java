package devices;

import com.zadania.Human;
import com.zadania.Sellable;

public class Phone extends Device implements Sellable {
    Phone(String model, String producer, int yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.havePhone() == true && buyer.getSalary() > price) {
            buyer.setSalary(buyer.getSalary() - price);
            seller.setSalary(seller.getSalary() + price);
            Phone tmp = seller.getPhone();
            buyer.setPhone(tmp);
            seller.setPhone(null);
        }
    }
}
