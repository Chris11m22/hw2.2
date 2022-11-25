package transport;

import transport.Bus;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Train lastochka = new Train("Ласточка ", "B-901", 2011, "Россия ", null, 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград ", "D-125", 2019, "Россия ", null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        lastochka.trains();
        lastochka.refill();
        leningrad.trains();
        leningrad.refill();
        Bus min = new Bus("Малый вид ", "ПАЗ", 1989, "Россия ", null, 0);
        Bus middle = new Bus("Средкий класс ", "ЛиАЗ-4292", 2015, "Россия ", null, 0);
        Bus max = new Bus("Большой класс ", "MAN Lion", 2000, "Россия ", null, 0);
        min.buses();
        min.refill();
        middle.buses();
        middle.refill();
        max.buses();
        max.refill();
        Car lada = new Car("Lada", "Granta", 2015, "Россия", "Желтый", 160, 1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 280, 3.0);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "Черный", 320, 3.0);
        Car kia = new Car("KIA", "Sportage 4", 2018, "Южная Корея", "Красный", 180, 2.4);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная корея", "Оранжевый", 180, 1.6);
        lada.cars();
        lada.refill();
        audi.cars();
        audi.refill();
        bmw.cars();
        bmw.refill();
        kia.cars();
        kia.refill();
        hyundai.cars();
        hyundai.refill();

    }
}