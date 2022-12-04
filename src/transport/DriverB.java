package transport;

public class DriverB <B extends Car> extends Driver {
    public DriverB(String name, boolean licence, int experience) {
        super(name, licence, experience);
    }

    @Override
    public void startMove() {
        super.startMove();
    }

    @Override
    public void stopMove() {
        super.stopMove();
    }

    @Override
    public void refuel() {
        super.refuel();
    }
    public  void driverB(B car) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + car.getBrand() + car.getModel() + " и будет участвовать в заезде");
    }
}
