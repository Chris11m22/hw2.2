package transport;

public class Car extends Transport {
    public double engineVolume;


    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume) {
        super(brand, model, year, country, color, maxSpeed);

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;


    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public void cars() {
        System.out.println("Автомобиль " + getBrand() + " модель " + getModel() + " год " + getYear() + " страна " + getCountry() + ", " + getColor() + " цвета" + ", объем двигателя — " + getEngineVolume() + "л");
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");

    }
}
