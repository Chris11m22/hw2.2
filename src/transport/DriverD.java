package transport;

public class DriverD <D extends Bus> extends Driver {
    public DriverD(String name, boolean licence, int experience) {
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
    public  void driverD(D bus) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + bus.getModel() + " и будет участвовать в заезде");
    }

}