
import Cars.Bus;
import Cars.EasyCar;
import Cars.Trucks;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("ABC", true, 5);
        DriverC driverC = new DriverC("ABC", true, 5);
        DriverD driverD = new DriverD("ABC", true, 5);
        EasyCar eaCar1 = new EasyCar("Car", "Car", 3.2, driverB);
        EasyCar eaCar2 = new EasyCar("Car", "Car", 3.2, driverB);
        EasyCar eaCar3 = new EasyCar("Car", "Car", 3.2, driverB);
        EasyCar eaCar4 = new EasyCar("Car", "Car", 3.2, driverB);
        Trucks trCar1 = new Trucks("Truck", "Truck", 5.0, driverC);
        Trucks trCar2 = new Trucks("Truck", "Truck", 5.0, driverC);
        Trucks trCar3 = new Trucks("Truck", "Truck", 5.0, driverC);
        Trucks trCar4 = new Trucks("Truck", "Truck", 5.0, driverC);
        Bus bus1 = new Bus("Bus", "Bus", 4.3, driverD);
        Bus bus2 = new Bus("Bus", "Bus", 4.3, driverD);
        Bus bus3 = new Bus("Bus", "Bus", 4.3, driverD);
        Bus bus4 = new Bus("Bus", "Bus", 4.3, driverD);

        eaCar1.start();
        eaCar1.stop();
        System.out.println(eaCar1);
        eaCar1.pitStop();
        trCar3.goodTime();
        bus2.maxSpeed();

        eaCar2.categori();
        trCar3.categori();
        bus2.categori();


    }
}