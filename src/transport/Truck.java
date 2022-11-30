package transport;

public class Truck extends Transport implements Competing{
    private Mass mass;

    public Truck(String brand, String model, double engineVolume,Mass mass) {
        super(brand, model, engineVolume);
        this.mass = mass;

    }

    public Mass getMass() {
        return mass;
    }

    public void setMass(Mass mass) {
        this.mass = mass;
    }

    public void startMove() {
        System.out.print("Грузовой автомобиль начинает движение");
    }


    public void stopMove() {
        System.out.print("Грузовой автомобиль останавливается");
    }

    @Override
    public void printType() {
        if (mass == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println("Тип грузоподъемности: " + mass);
        }


    }


    @Override
    public String toString() {
        return "Truck{" + "brand = " + getBrand() + ", model = " + getModel() + ", engineVolume = " + engineVolume + '}';
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль : заезжает на Пит-стоп");

    }

    @Override
    public void bestTime() {
        System.out.println("Грузовой автомобиль : лучшее время круга ");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовой автомобиль : Максимальное время");

    }
}