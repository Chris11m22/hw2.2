package transport;

public abstract class transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    public String color;
    public int maxSpeed;

    public transport(String brand, String model, int year, String country,String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = "белый";
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
