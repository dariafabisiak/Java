package devices;

import com.zadania.Human;
import com.zadania.Sellable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Phone extends Device implements Sellable {

    static final String defaultURL = "defaultAppAddres.com/app";
    static final String defaultProtocol = "ftp";
    static final String defaultName = "defaultAppName";

    public Phone(String model, String producer, int yearOfProduction) {
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

    public void installAnnApp(String appName) {
        System.out.println("Installed app name:{" + appName + "}");
    }

    public void installAnnApp(String appName, String version) {
        System.out.println("Installed app name:{" + appName + "} version:{" + version + "}");
    }

    public void installAnnApp(String appName, String version, URL url) {
        System.out.println("Installed app name:{" + appName + "} version:{" + version + "} URL:{" + url + "}");
    }

    public void installAnnApp(ArrayList<String> appNames) {
        System.out.println("Installing apps...");
        for(String name : appNames)
            System.out.println("Installed app name:{" + name + "}");
    }

    public void installAnnApp(URL url) {
        System.out.println("Installed app name:{" + url + "}");
    }
}
