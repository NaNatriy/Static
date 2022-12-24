public class Bus extends Transport {

    public Bus(String brand, String model, String country, int year, String color, int maxSpeed) {
        super(brand, model, country, year, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус:" +
                    "Бренд='" + brand + '\'' +
                    ", Модель='" + model + '\'' +
                    ", Год=" + year +
                    ", Страна='" + country + '\'' +
                    ", Цвет='" + color + '\'' +
                    ", maxSpeed=" + maxSpeed +
                    '}';
    }
}
