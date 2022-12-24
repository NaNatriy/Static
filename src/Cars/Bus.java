package Cars;

import Drivers.DriverD;

public class Bus extends Transport<DriverD> implements Competing{


    public Bus(String brand, String model , double volume, DriverD driver) {
        super(brand, model, volume, driver);
    }

    @Override
    public String toString() {
        return "Автобус:" +
                    "Бренд='" + brand + '\'' +
                    ", Модель='" + model + '\'' +
                    '}';
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
