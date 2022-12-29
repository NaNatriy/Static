import Cars.*;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

public class Main {
    public static void main(String[] args) {
//        System.out.println(CarD.LARGE.toString());

        DriverB driverB = new DriverB("ABC", true, 5);
        DriverC driverC = new DriverC("ABC", true, 5);
        DriverD driverD = new DriverD("ABC", true, 5);

        EasyCar eaCar1 = new EasyCar("Car", "Car", 3.2, driverB, CarB.HATCHBACK);
//        EasyCar eaCar2 = new EasyCar("Car", "Car", 3.2, driverB);
//        EasyCar eaCar3 = new EasyCar("Car", "Car", 3.2, driverB);
//        EasyCar eaCar4 = new EasyCar("Car", "Car", 3.2, driverB);
        System.out.println(eaCar1);
        eaCar1.printType();
        System.out.println("-------------------------------------");

        Trucks trCar1 = new Trucks("Truck", "Truck", 5.0, driverC, CarC.N3);
//        Trucks trCar2 = new Trucks("Truck", "Truck", 5.0, driverC);
//        Trucks trCar3 = new Trucks("Truck", "Truck", 5.0, driverC);
//        Trucks trCar4 = new Trucks("Truck", "Truck", 5.0, driverC);
        System.out.println(trCar1);
        trCar1.printType();
        System.out.println("-------------------------------------");

        Bus bus1 = new Bus("Bus", "Bus", 4.3, driverD, CarD.VERYLARGE);
//        Bus bus2 = new Bus("Bus", "Bus", 4.3, driverD);
//        Bus bus3 = new Bus("Bus", "Bus", 4.3, driverD);
//        Bus bus4 = new Bus("Bus", "Bus", 4.3, driverD);
        System.out.println(bus1);
        bus1.printType();

//        eaCar1.start();
//        eaCar1.stop();
//        System.out.println(eaCar1);
//        eaCar1.pitStop();
//        trCar3.goodTime();
//        bus2.maxSpeed();
//
//        eaCar2.categori();
//        trCar3.categori();
//        bus2.categori();


    }
}