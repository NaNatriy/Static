package cars;

import drivers.DriverC;
import mechanics.Mechanic;

public class Trucks extends Transport<DriverC, Mechanic> implements Competing {

private CarC carC;
    public Trucks(String brand, String model, double volume, DriverC driver, CarC carC, Mechanic cars, Mechanic mechanicA) {
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
    public void diagnostics(){
        System.out.println("Пройти диагностику");
        System.out.println("Диагностика пройдена");
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

    public enum CarC {
        N1(null, 3.5f), N2(3.5f, 12f), N3(12f, null);

        private Float minMass;
        private Float maxMass;


        CarC(Float minMass, Float maxMass) {
            this.minMass = minMass;
            this.maxMass = maxMass;
        }

        @Override
        public String toString() {
            if (minMass == null) {
                return "Грузоподъемность: до " + maxMass + " тонн.";
            } else if (maxMass == null) {
                return "Грузоподъемность: от " + minMass + " тонн.";
            } else {
                return "Грузоподъемность: от " + minMass +
                        " тонн, до " + maxMass + " тонн.";
            }
        }

        public float getMinMass() {
            return minMass;
        }

        public float getMaxMass() {
            return maxMass;
        }
    }
}