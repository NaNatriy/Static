package Cars;

import Drivers.DriverC;

public class Trucks extends Transport<DriverC> implements Competing {

private CarC carC;
    public Trucks(String brand, String model, double volume, DriverC driver, CarC carC) {
        super(brand, model, volume, driver);
        this.carC = carC;
    }

    public void printType() {
        if (carC != null) {
            System.out.println(carC);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
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