package cars;


import drivers.DriverB;
import mechanics.Mechanic;

public class EasyCar extends Transport<DriverB, Mechanic> implements Competing {
private CarB carB;
    public EasyCar(String brand, String model, double volume, DriverB driver, CarB carB, Mechanic cars, Mechanic mechanicA) {
        super(brand, model, volume, driver, cars);
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
    public void diagnostics(){
        System.out.println("Пройти диагностику");
        System.out.println("Диагностика пройдена");
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

    public enum CarB {
        SEDAN("Седан"), HATCHBACK("Хетчбек"), COUPE("Купе"), UNIVERSAL("Универсал"), SUV("Внедорожник"), CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");

        private String ruName;

        CarB(String ruName) {
            this.ruName = ruName;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + ruName;
        }

        public String getRuName() {
            return ruName;
        }
    }
}
