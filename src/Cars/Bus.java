package Cars;

import Drivers.DriverD;

public class Bus extends Transport<DriverD> implements Competing{

    private CarD carD;
    public Bus(String brand, String model , double volume, DriverD driver, CarD carD) {
        super(brand, model, volume, driver);
        this.carD = carD;
    }

    public void printType() {
        if (carD != null) {
            System.out.println(carD);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("проверить тормоза");
    }

    @Override
    public void goodTime() {
        System.out.println("12:20");
    }

    @Override
    public void maxSpeed() {
        System.out.println("130km/ch");
    }
}
