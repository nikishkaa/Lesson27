package by.itstep.goutor.javalesson.lesson27.gasstation2.model.data;

public class Transport {
    private String brand;
    private double tank;

    public Transport(String brand, double tank) {
        this.brand = brand;
        this.tank = tank;
    }

    public String getBrand() {
        return brand;
    }

    public double getTank() {
        return tank;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", tank=" + tank +
                '}';
    }
}
