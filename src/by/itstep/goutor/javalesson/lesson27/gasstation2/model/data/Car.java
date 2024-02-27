package by.itstep.goutor.javalesson.lesson27.gasstation2.model.data;

public class Car extends Transport{
    private String brand;
    private double tank;
    private double power;


    public Car(String brand, double tank, double power) {
        super(brand, tank);
        this.brand = brand;
        this.tank = tank;
        this.power = power;
    }



    public double getPower() {
        return power;
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
