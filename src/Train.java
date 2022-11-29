
public class Train extends Transport {
    int cost;
    int travelTime;
    String departureStationName;
    String arrivingStationName;
    int wagonsNum;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed,
                 int cost, int travelTime, String departureStationName, String arrivingStationName, int wagonsNum) {
        super(brand, model, year, country, color, maxSpeed);
        this.cost = Utility.validateInt(cost);
        this.travelTime = Utility.validateInt(travelTime);
        this.departureStationName = Utility.validateString(departureStationName);
        this.arrivingStationName = Utility.validateString(arrivingStationName);
        this.wagonsNum = Utility.validateInt(wagonsNum);
    }

    public int getCost() {
        return cost;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public String getArrivingStationName() {
        return arrivingStationName;
    }

    public int getWagonsNum() {
        return wagonsNum;
    }

    public void setCost(int cost) {
        this.cost = Utility.validateInt(cost);
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = Utility.validateInt(travelTime);
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = Utility.validateString(departureStationName);
    }

    public void setArrivingStationName(String arrivingStationName) {
        this.arrivingStationName = Utility.validateString(arrivingStationName);
    }



    @Override
    public String toString() {
        return "Train{" +
                "cost=" + cost +
                ", travelTime=" + travelTime +
                ", departureStationName='" + departureStationName + '\'' +
                ", arrivingStationName='" + arrivingStationName + '\'' +
                ", wagonsNum=" + wagonsNum +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public void refill() {
        System.out.println("Дизель");
        this.fuelPercentage = 100.00;

    }
}
