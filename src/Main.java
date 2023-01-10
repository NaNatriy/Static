import cars.*;
import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import mechanics.Mechanic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(CarD.LARGE.toString());

        DriverB driverB = new DriverB("ABC", true, 5);
        DriverC driverC = new DriverC("ABC", true, 5);
        DriverD driverD = new DriverD("ABC", false, 5);

        Mechanic mechanicB = new Mechanic("Павел", "Ford", Mechanic.transp.EASYCAR);
        Mechanic mechanicC = new Mechanic("Иван", "CAT", Mechanic.transp.TRUCKS);
        Mechanic mechanicD = new Mechanic("Антон", "Bus", Mechanic.transp.BUS);
        Mechanic mechanicA = new Mechanic("Петрович", "CТО", Mechanic.transp.ALL);
        System.out.println(mechanicB);
        System.out.println(mechanicC);
        System.out.println(mechanicD);
        System.out.println(mechanicA);

        EasyCar eaCar1 = new EasyCar("Car", "Car", 3.2, driverB, EasyCar.CarB.HATCHBACK, mechanicB, mechanicA);
//        EasyCar eaCar2 = new EasyCar("Car", "Car", 3.2, driverB);
//        EasyCar eaCar3 = new EasyCar("Car", "Car", 3.2, driverB);
//        EasyCar eaCar4 = new EasyCar("Car", "Car", 3.2, driverB);
//        System.out.println(eaCar1);
//        eaCar1.printType();
//        eaCar1.diagnostics();
//        System.out.println(driverB);
//        driverB.chekedLisence();
//        System.out.println(driverB.chekedLisence());
        System.out.println("-------------------------------------");

        Trucks trCar1 = new Trucks("Truck", "Truck", 5.0, driverC, Trucks.CarC.N3, mechanicC, mechanicA);
//        Trucks trCar2 = new Trucks("Truck", "Truck", 5.0, driverC);
//        Trucks trCar3 = new Trucks("Truck", "Truck", 5.0, driverC);
//        Trucks trCar4 = new Trucks("Truck", "Truck", 5.0, driverC);
//        System.out.println(trCar1);
//        trCar1.printType();
//        trCar1.diagnostics();
//        System.out.println(driverC);
//        driverC.chekedLisence();
        System.out.println("-------------------------------------");

        Bus bus1 = new Bus("Bus", "Bus", 4.3, driverD, Bus.CarD.LARGE, mechanicD, mechanicA);
//        Bus bus2 = new Bus("Bus", "Bus", 4.3, driverD);
//        Bus bus3 = new Bus("Bus", "Bus", 4.3, driverD);
//        Bus bus4 = new Bus("Bus", "Bus", 4.3, driverD);
//        System.out.println(bus1);
//        bus1.printType();
//        System.out.println(driverD);
//        driverD.chekedLisence();
//        bus1.diagnostics();

//        eaCar1.start();
//        eaCar1.stop();
//        System.out.println(eaCar1);
//        eaCar1.pitStop();
//        trCar3.goodTime();
//        bus2.maxSpeed();
//
//        eaCar1.categori();
        List<Mechanic> mechanicList = new ArrayList<>();
        mechanicList.add(mechanicB);
        mechanicList.add(mechanicC);
        mechanicList.add(mechanicD);
        mechanicList.add(mechanicA);
        System.out.println(mechanicList);

        List<Transport> transportList = new ArrayList<>();
        transportList.add(eaCar1);
        transportList.add(trCar1);
        transportList.add(bus1);
        System.out.println(transportList);


        List<Driver> driverList = new ArrayList<>();
        driverList.add(driverB);
        driverList.add(driverC);
        driverList.add(driverD);
        System.out.println(driverList);
    }

}