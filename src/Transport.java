public class Transport {
    protected String brand;
    protected String model;
    protected final int year;
    protected final String country;
    protected String color;
    protected int maxSpeed;

    public Transport(String brand, String model, String country, int year, String color, int maxSpeed) {
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
        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 60;
        } else {
            this.maxSpeed = maxSpeed;
        }
        if (year <= 0) {
            this.year = 2022;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", counter='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
