package transport;

public class bus extends transport {
    public bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);

    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке.");

    }

    public void buses() {
      System.out.println("Автобус " + getBrand() + " модель " + getModel() + " год " + getYear() + " страна " + getCountry() + getColor() + " скорость " + getMaxSpeed());
  }
}

