package transport;

public class Car extends Transport implements Competing {
    private TypeOfBody typeOfBody;


    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;


    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }
    public void startMove() {
        System.out.print("Легковой автомобиль начинает движение");
    }


    public void stopMove() {
        System.out.print("Легковой автомобиль останавливается");
    }
    private boolean diagnostics;
    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println("Тип кузова: " + typeOfBody);
        }

    }
    @Override
    public boolean diagnostics() {
        if (diagnostics) {
            System.out.println("Автомобиль " + getBrand() + " " + getModel() + " прошел диагностику.");
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Car{"  + "brand = " + getBrand() + ", model = " + getModel() + getTypeOfBody() + ", engineVolume = " + engineVolume + '}';
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
    public boolean isDiagnostic() {
        return diagnostics;
    }

    public void setDiagnostic(boolean diagnostic) {
        this.diagnostics = diagnostic;
    }
}



//