package transport;

public class Bus extends Transport implements Competing {
    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public void startMove() {
        System.out.print("Автобус начинает движение");
    }


    public void stopMove() {
        System.out.print("Автобус останавливается");
    }


    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println("Тип вместимости: " + capacity);
        }


    }

    public boolean diagnostics() {
        System.out.println("Автобус " +getBrand() + "" + getModel() + " не нуждается в диагностике");
        return true;
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