public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelPercentage=" + fuelPercentage +
                '}';
    }

    @Override
    public void refill() {
        System.out.println("Дизель, бензин");
        this.fuelPercentage = 100.00;
    }
}
