package by.itstep.goutor.javalesson.lesson27.gasstation2.model.data;

public class Bus extends  Transport{
    private String brand;
    private int place;
    private double tank;


    public Bus(String brand, int place, double tank) {
        super(brand, tank);
        this.place = place;
    }



    public int getPlace() {
        return place;
    }




    public void setPlace(int place) {
        this.place = place;
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
