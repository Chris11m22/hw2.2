package transport;

public class Car extends Transport implements Competing {


    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

    }
    public void startMove() {
        System.out.print("Легковой автомобиль начинает движение");
    }


    public void stopMove() {
        System.out.print("Легковой автомобиль останавливается");
    }


    @Override
    public String toString() {
        return "Car{"  + "brand = " + getBrand() + ", model = " + getModel() + ", engineVolume = " + engineVolume + '}';
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль : заезжает на Пит-стоп");

    }

    @Override
    public void bestTime() {
        System.out.println("Легковой автомобиль : лучшее время круга ");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Легковой автомобиль : Максимальное время");

    }
}



//