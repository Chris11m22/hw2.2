package transport;

public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

    }
    public void startMove() {
        System.out.print("Грузовой автомобиль начинает движение");
    }


    public void stopMove() {
        System.out.print("Грузовой автомобиль останавливается");
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