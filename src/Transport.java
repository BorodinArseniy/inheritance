public abstract class Transport {
    protected String brand;
    protected String model;
    protected int year;
    protected String country;
    protected String color;
    protected int maxSpeed;

    protected double fuelPercentage;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = Utility.validateString(brand);
        this.model = Utility.validateString(model);
        this.year = Utility.validateInt(year);
        this.country = Utility.validateString(country);
        this.color = Utility.validateString(color);
        this.maxSpeed = Utility.validateInt(maxSpeed);
    }

    public abstract void refill();

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage >= 0 && fuelPercentage <=100){
            this.fuelPercentage = fuelPercentage;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = Utility.validateString(color);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Utility.validateInt(maxSpeed);
    }
}
