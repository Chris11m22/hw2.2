package transport;

public abstract class Transport {
    private String brand;
    private String model;
    public double engineVolume;


    public Transport(String brand, String model, double engineVolume) {
        if (brand == null) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;


    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 6;
        }
        this.engineVolume = engineVolume;
    }
    public void startMove() {
    }


    public void stopMove() {
    }
    public abstract void printType();
    public abstract boolean diagnostics();
    @Override
    public String toString() {
        return "Transport{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
    }
}