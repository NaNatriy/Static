package Cars;

import Drivers.DriverC;

public class Trucks extends Transport<DriverC> implements Competing{


    public Trucks(String brand, String model, double volume, DriverC driver) {
        super(brand, model, volume, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("заправить бак");
    }

    @Override
    public void goodTime() {
        System.out.println("10:33");
    }

    @Override
    public void maxSpeed() {
        System.out.println("150km/ch");
    }
}

