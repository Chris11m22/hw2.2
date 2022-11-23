import transport.bus;
import transport.train;

public class Main {
    public static void main(String[] args) {
        train lastochka = new train( "Ласточка ", "B-901",2011,"Россия ", null, 301,3500, 0,"Белорусский вокзал", "Минск-Пассажирский", 11);
        train leningrad = new train( "Ленинград ", "D-125",2019,"Россия ", null, 270,1700, 0,"Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        lastochka.trains();
        lastochka.refill();
        leningrad.trains();
        leningrad.refill();
        bus min = new bus( "Малый вид ", "ПАЗ",1989,"Россия ", null, 0);
        bus middle = new bus( "Средкий класс ", "ЛиАЗ-4292" ,2015,"Россия ", null, 0);
        bus max = new bus( "Большой класс ", "MAN Lion",2000,"Россия ", null,0 );
        min.buses();
        min.refill();
        middle.buses();
        middle.refill();
        max.buses();
        max.refill();

    }
    }