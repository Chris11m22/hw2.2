package transport;

public class DriverC <C extends Truck> extends Driver{
    public DriverC(String name, boolean licence, int experience) {
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
    public  void driverC(C truck) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + truck.getBrand() + truck.getModel() + " и будет участвовать в заезде");
    }
}
