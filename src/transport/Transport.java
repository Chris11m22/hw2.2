package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    public String color;
    public int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand == null) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null) {
            model = "default";
        }
        this.model = model;

        if (year < 0) {
            year = 2000;
        }
        this.year = year;

        if (country == null) {
            country = "default";
        }
        this.country = country;

        if (color == null) {
            color = "белого";
        }
        this.color = color;
        this.maxSpeed = 100;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null && !color.isEmpty() && !color.isBlank()) {

            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {

            this.maxSpeed = maxSpeed;
        }
    }

    public abstract void refill();
}
