package Cars;


import Drivers.DriverB;

public class EasyCar extends Transport<DriverB> implements Competing{

    public EasyCar(String brand, String model, double volume, DriverB driver) {
        super(brand, model, volume, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("попить водички");
    }

    @Override
    public void goodTime() {
        System.out.println("6:40");
    }

    @Override
    public void maxSpeed() {
        System.out.println("240km/ch");
    }
}

