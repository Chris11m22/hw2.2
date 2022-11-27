package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMove() {
        System.out.print("Автобус начинает движение");
    }


    public void stopMove() {
        System.out.print("Автобус останавливается");
    }

    @Override
    public String toString() {
        return "Bus{" + "brand = " + getBrand() + ", model = " + getModel() + ", engineVolume = " + engineVolume + '}';
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус : заезжает на Пит-стоп");

    }

    @Override
    public void bestTime() {
        System.out.println("Автобус : лучшее время круга ");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус : Максимальное время");

    }
}