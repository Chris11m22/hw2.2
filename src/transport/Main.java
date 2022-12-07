package transport;

import transport.Bus;


public class Main {
    public static void main(String[] args) {
        Bus min = new Bus("Малый вид ", "ПАЗ", 0, Capacity.SMALL);
        Bus middle = new Bus("Средкий класс ", "ЛиАЗ-4292", 0, Capacity.MIDDLE);
        Bus max = new Bus("Большой класс ", "MAN Lion", 0, Capacity.BIG);
//        System.out.println(max);
//        System.out.println(middle);
//        System.out.println(max);

        Car lada = new Car("Lada", "Granta", 1.7, TypeOfBody.CMD_SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, TypeOfBody.CMD_CROSSOVER);
        Car bmw = new Car("BMW", "Z8", 3.0, TypeOfBody.CMD_COUPE);
        Car kia = new Car("KIA", "Sportage 4", 2.4, TypeOfBody.CMD_MINIVAN);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, TypeOfBody.CMD_HATCHBACK);
        Car ferrari = new Car("Ferrari", "F40", 5.1, TypeOfBody.CMD_SUV);
//        System.out.println(lada);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println(hyundai);
//        System.out.println(ferrari);



        Truck valdai = new Truck("Валдай ", "NEXT", 7.2, Mass.N1);
        Truck gaz = new Truck("ГАЗель ", "NN", 7.2, Mass.N1);
        Truck jac = new Truck("JAC", "N-35/25", 7.2, Mass.N2);
        Truck tonar = new Truck("Тонар ", "7502", 7.2, Mass.N3);
//        System.out.println(valdai);
//        System.out.println(gaz);
//        System.out.println(jac);
//        System.out.println(tonar);
        diagnostics(lada,audi,bmw,kia,hyundai,ferrari,valdai,gaz,jac,tonar);

        DriverD jack = new DriverD("Jack", true, 5);
        jack.driverD(max);
        DriverC mike = new DriverC<>("Mike", true, 4);
        mike.driverC(tonar);
        DriverB will = new DriverB<>("Will", true, 7);
        will.driverB(audi);
    }
    public static void diagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                if (!transport.diagnostics())
                    throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println(transport.getClass().getSimpleName() + " " + transport.getBrand() + " " + transport.getModel() + " необходимо пройти диагностику.");
            }
        }

            }

        }
