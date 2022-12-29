package Cars;

public abstract class Transport <T>{
    protected final String brand;
    protected final String model;
    protected final double volume;
    protected T driver;

    public Transport(String brand, String model, double volume, T driver) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (volume == 0) {
            this.volume = 2.0;
        } else {
            this.volume = volume;
        }
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " + "Бренд - " + brand + ", Модель - " + model + ", Объем двигателя - " + volume + " " + driver;
    }

    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getVolume() {
        return volume;
    }

    public void start() {
        System.out.println("Начал движение");
    }

    public void stop() {
        System.out.println("Закончил движение");
    }

    public void categori() {
        System.out.println("водитель " + driver + " управляет автомобилем " + this + " и будет участвовать в заезде");
    }
}