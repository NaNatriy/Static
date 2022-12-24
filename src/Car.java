import java.time.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Car extends Transport {
    private double engineVolume;
    private final String country;
    private String transmisson;
    private final String bodyType;
    private int regisNumber;
    private final int seatsNumber;
    private boolean isWinter;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmisson, String bodyType, int regisNumber, int seatsNumber, boolean isWinter, int maxSpeed) {
        super(brand, model, country, year, color, maxSpeed);
        if (country == null || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmisson == null || transmisson.isBlank()) {
            this.transmisson = "default";
        } else {
            this.transmisson = transmisson;
        }
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (regisNumber == 0) {
            this.regisNumber = 123;
        } else {
            this.regisNumber = regisNumber;
        }
        if (seatsNumber == 0) {
            this.seatsNumber = 4;
        } else {
            this.seatsNumber = seatsNumber;
        }
        this.isWinter = isWinter;
    }

    @Override
    public String toString() {
        return " год выпуска, сборка " + country + ", " + " цвет, объем двигателя - " + engineVolume + ", трансмиссия - " + transmisson + ", кузов - " + bodyType + ", регистрационный номер: " + regisNumber + ", количество мест: " + seatsNumber + " Зимняя резина: " + isWinter;
    }

    public void changeIsWinter(int month) {
        if (month < 10 || month > 4) {
            isWinter = false;
        } else {
            isWinter = true;
        }
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmisson() {
        return transmisson;
    }

    public void setTransmisson(String transmisson) {
        this.transmisson = transmisson;
    }

    public int getRegisNumber() {
        return regisNumber;
    }

    public void setRegisNumber(int regisNumber) {
        this.regisNumber = regisNumber;
    }

    public static class Key {
        private boolean remoteStart;
        private boolean withoutKey;

        public Key(boolean remoteStart, boolean withoutKey) {
            this.remoteStart = remoteStart;
            this.withoutKey = withoutKey;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", withoutKey=" + withoutKey +
                    '}';
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isWithoutKey() {
            return withoutKey;
        }
    }

    public static class Insurance {
        private final LocalDate duration;
        private final int price;
        private final String numInsurance;

        public Insurance(LocalDate duration, int price, String numInsurance) {
            if (duration == null) {
                this.duration = LocalDate.now();
            } else {
                this.duration = duration;
            }
            this.price = price;
            if (numInsurance == null || numInsurance.isBlank()) {
                this.numInsurance = "000000000";
            } else {
                this.numInsurance = numInsurance;
            }
        }

        public void checkNumber() {
            if (numInsurance.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        public void checkDate() {
            if (duration.isBefore(LocalDate.now()) || duration.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        @Override

        public String toString() {
            return "Insurance{" +
                    "validity=" + duration +
                    ", price=" + price +
                    ", numInsurance='" + numInsurance + '\'' +
                    '}';
        }
    }

}



