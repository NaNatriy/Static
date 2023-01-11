package cars;

import drivers.DriverD;
import errExp.notDiagnostics;
import mechanics.Mechanic;

public class Bus extends Transport<DriverD, Mechanic> implements Competing{

    private CarD carD;
    public Bus(String brand, String model , double volume, DriverD driver, CarD carD, Mechanic cars, Mechanic mechanicA) {
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
    public void diagnostics(){
        try {
            System.out.println("Пройти диагностику");
            throw new notDiagnostics();
        } catch (notDiagnostics exp){
            System.out.println("Автобусы диагностику проходить не могут");
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

//    public static void diagnostics() throws Exception {
//        throw new Exception ("Автобусы диагностику проходить не могут");
//    }

    public enum CarD {
        VERYSMALL(null, 10), SMALL(null, 25), MEDIUM(40, 50), LARGE(60, 80), VERYLARGE(100, 120);

        private Integer minSeats;
        private Integer maxSeats;

        CarD(Integer minSeats, Integer maxSeats) {
            this.minSeats = minSeats;
            this.maxSeats = maxSeats;
        }

        @Override
        public String toString() {
            if (minSeats == null) {
                return "Вместимость: до " + maxSeats + " мест.";
            } else {
                return "Вместимость: " + minSeats + " - " + maxSeats + " мест.";
            }
        }

        public Integer getMinSeats() {
            return minSeats;
        }

        public Integer getMaxSeats() {
            return maxSeats;
        }
    }
}

