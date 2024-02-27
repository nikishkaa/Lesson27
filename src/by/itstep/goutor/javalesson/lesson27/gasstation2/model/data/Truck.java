package by.itstep.goutor.javalesson.lesson27.gasstation2.model.data;

public class Truck extends Transport{
    private String brand;
    private double volume;
    private double weight;
    private double tank;

    public Truck(String brand, double volume, double weight, double tank) {
      super(brand, tank);
        this.volume = volume;
        this.weight = weight;
    }


    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }




    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", weight=" + weight +
                ", tank=" + tank +
                '}';
    }
}
