package by.itstep.goutor.javalesson.lesson27.gasstation.model.data;

public class Car {
    private String brand;
    private double tank;
    private double power;


    public Car(String brand, double tank, double power) {
        this.brand = brand;
        this.tank = tank;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public double getTank() {
        return tank;
    }

    public double getPower() {
        return power;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", tank=" + tank +
                ", power=" + power +
                '}';
    }
}
