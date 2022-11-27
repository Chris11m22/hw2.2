package transport;

import transport.Bus;


public class Main {
    public static void main(String[] args) {
        Bus min = new Bus("Малый вид ", "ПАЗ", 0);
        Bus middle = new Bus("Средкий класс ", "ЛиАЗ-4292", 0);
        Bus max = new Bus("Большой класс ", "MAN Lion", 0);
        System.out.println(max);
        System.out.println(middle);
        System.out.println(max);

        Car lada = new Car("Lada", "Granta", 1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmw = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("KIA", "Sportage 4", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", 1.6);
        Car ferrari = new Car("Ferrari", "F40", 5.1);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(ferrari);


        Truck valdai = new Truck("Валдай ", "NEXT", 7.2);
        Truck gaz = new Truck("ГАЗель ", "NN", 7.2);
        Truck jac = new Truck("JAC", "N-35/25", 7.2);
        Truck tonar = new Truck("Тонар ", "7502", 7.2);
        System.out.println(valdai);
        System.out.println(gaz);
        System.out.println(jac);
        System.out.println(tonar);

        DriverD jack = new DriverD("Jack",true,5);
        jack.driverD(max);
        DriverC mike = new DriverC<>("Mike",true,4);
        mike.driverC(tonar);
        DriverB will = new DriverB<>("Will",true,7);
        will.driverB(audi);
    }
}