public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNum;
    private int seatsNum;
    private boolean winterRubber;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume,
               String transmission, String bodyType, String registrationNum, int seatsNum, boolean winterRubber) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = Utility.validateDouble(engineVolume);
        this.transmission = Utility.validateString(transmission);
        this.bodyType = Utility.validateString(bodyType);
        this.registrationNum = Utility.validateString(registrationNum);
        this.seatsNum = Utility.validateInt(seatsNum);
        this.winterRubber = winterRubber;
    }

    //region
    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public boolean isWinterRubber() {
        return winterRubber;
    }

    public void setWinterRubber(boolean winterRubber) {
        this.winterRubber = winterRubber;
    }
    //endregion

    @Override
    public void refill() {
        System.out.println("Дизель, бензин, электрокар");
        this.fuelPercentage = 100.00;
    }
}
