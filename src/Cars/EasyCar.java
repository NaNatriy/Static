package Cars;


import Drivers.DriverB;

public class EasyCar extends Transport<DriverB> implements Competing {
private CarB carB;
    public EasyCar(String brand, String model, double volume, DriverB driver, CarB carB) {
        super(brand, model, volume, driver);
        this.carB = carB;
    }

    public void printType() {
        if (carB != null) {
            System.out.println(carB);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
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
