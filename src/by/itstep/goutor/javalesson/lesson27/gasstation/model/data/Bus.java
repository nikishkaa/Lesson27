package by.itstep.goutor.javalesson.lesson27.gasstation.model.data;

public class Bus {
    private String brand;
    private int place;
    private double tank;


    public Bus(String brand, int place, double tank) {
        this.brand = brand;
        this.place = place;
        this.tank = tank;
    }

    public String getBrand() {
        return brand;
    }

    public int getPlace() {
        return place;
    }

    public double getTank() {
        return tank;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", place=" + place +
                ", tank=" + tank +
                '}';
    }
}
