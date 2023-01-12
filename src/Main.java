import cars.*;
import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import mechanics.Mechanic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println(CarD.LARGE.toString());

        DriverB driverB = new DriverB("Степан", true, 5);
        DriverC driverC = new DriverC("Макс", true, 5);
        DriverD driverD = new DriverD("Лёша", false, 5);

        Mechanic mechanicB = new Mechanic("Павел", "Ford", Mechanic.Transp.EASYCAR);
        Mechanic mechanicC = new Mechanic("Иван", "CAT", Mechanic.Transp.TRUCKS);
        Mechanic mechanicD = new Mechanic("Антон", "Bus", Mechanic.Transp.BUS);
        Mechanic mechanicA = new Mechanic("Петрович", "CТО", Mechanic.Transp.ALL);

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

        HashMap<Object, Mechanic> mechanicList = new HashMap<Object, Mechanic>();
        mechanicList.putIfAbsent(eaCar1, mechanicB);
        mechanicList.putIfAbsent(trCar1, mechanicC);
        mechanicList.putIfAbsent(bus1, mechanicD);
        mechanicList.putIfAbsent(bus1, mechanicC);
        mechanicList.putIfAbsent(bus1, mechanicB);
        mechanicList.putIfAbsent(Mechanic.Transp.ALL, mechanicA);
        System.out.println(mechanicList.values());

//        List<Transport> transportList = new ArrayList<>();
//        transportList.add(eaCar1);
//        transportList.add(eaCar1);
//        transportList.add(trCar1);
//        transportList.add(bus1);
//        System.out.println(transportList);

        Set<Driver> driverList = new HashSet<>();
        driverList.add(driverB);
        driverList.add(driverC);
        driverList.add(driverD);
        driverList.add(driverD);
        driverList.add(driverD);
        System.out.println(driverList);


    }
}
