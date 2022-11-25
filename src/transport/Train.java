package transport;

public class Train extends Transport {
    public int price;
    public int travelTime;
    private String departureStation;
    private String finalStation;
    public int wagonNumbers;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed, int price, int travelTime, String departureStation, String finalStation, int wagonNumbers) {
        super(brand, model, year, country, color, maxSpeed);
        this.price = price;
        this.travelTime = travelTime;
        this.departureStation = departureStation;
        this.finalStation = finalStation;
        this.wagonNumbers = wagonNumbers;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            this.price = price;
        }
    }

    public int getTravelTime() {
        return travelTime;
    }


    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = finalStation;
    }

    public int getWagonNumbers() {
        return wagonNumbers;
    }

    public void setWagonNumbers(int wagonNumbers) {
        this.wagonNumbers = wagonNumbers;
    }

    public void trains() {
        System.out.println("Поезд " + getBrand() + "модель " + getModel() + " " + getYear() + " год выпуска в " + getCountry() + "скорость передвижения — " + getMaxSpeed() + "км/ч, отходит от " + departureStation + "и следует до станции " + finalStation + ". Цена поездки — " + price + " рублей, в поезде " + wagonNumbers + " вагонов.");

    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
    }
}
