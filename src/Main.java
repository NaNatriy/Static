import cars.*;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(CarD.LARGE.toString());

        DriverB driverB = new DriverB("ABC", true, 5);
        DriverC driverC = new DriverC("ABC", true, 5);
        DriverD driverD = new DriverD("ABC", false, 5);

        EasyCar eaCar1 = new EasyCar("Car", "Car", 3.2, driverB, EasyCar.CarB.HATCHBACK);
//        EasyCar eaCar2 = new EasyCar("Car", "Car", 3.2, driverB);
//        EasyCar eaCar3 = new EasyCar("Car", "Car", 3.2, driverB);
//        EasyCar eaCar4 = new EasyCar("Car", "Car", 3.2, driverB);
        System.out.println(eaCar1);
        eaCar1.printType();
        eaCar1.diagnostics();
        System.out.println(driverB);
        driverB.chekedLisence();
//        System.out.println(driverB.chekedLisence());
        System.out.println("-------------------------------------");

        Trucks trCar1 = new Trucks("Truck", "Truck", 5.0, driverC, Trucks.CarC.N3);
//        Trucks trCar2 = new Trucks("Truck", "Truck", 5.0, driverC);
//        Trucks trCar3 = new Trucks("Truck", "Truck", 5.0, driverC);
//        Trucks trCar4 = new Trucks("Truck", "Truck", 5.0, driverC);
        System.out.println(trCar1);
        trCar1.printType();
        trCar1.diagnostics();
        System.out.println(driverC);
        driverC.chekedLisence();
        System.out.println("-------------------------------------");

        Bus bus1 = new Bus("Bus", "Bus", 4.3, driverD, Bus.CarD.LARGE);
//        Bus bus2 = new Bus("Bus", "Bus", 4.3, driverD);
//        Bus bus3 = new Bus("Bus", "Bus", 4.3, driverD);
//        Bus bus4 = new Bus("Bus", "Bus", 4.3, driverD);
        System.out.println(bus1);
        bus1.printType();
        System.out.println(driverD);
        driverD.chekedLisence();
        bus1.diagnostics();

//        eaCar1.start();
//        eaCar1.stop();
//        System.out.println(eaCar1);
//        eaCar1.pitStop();
//        trCar3.goodTime();
//        bus2.maxSpeed();
//
//        eaCar1.categori();
    }

}