package by.itstep.goutor.javalesson.lesson27.gasstation2.controller;

import by.itstep.goutor.javalesson.lesson27.gasstation2.model.data.Bus;
import by.itstep.goutor.javalesson.lesson27.gasstation2.model.data.Car;
import by.itstep.goutor.javalesson.lesson27.gasstation2.model.data.Transport;
import by.itstep.goutor.javalesson.lesson27.gasstation2.model.data.Truck;
import by.itstep.goutor.javalesson.lesson27.gasstation2.model.logic.GasStation;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("Scania", 50, 480);
        Bus bus2 = new Bus("Man", 55, 520);

        Car car1 = new Car("Bmw", 120, 50);
        Car car2 = new Car("Scoda", 115, 90);
        Car car3 = new Car("Honda", 250, 65);

        Truck truck = new Truck("Iveco", 12000, 28, 800);


        Transport[] transports = {bus1, bus2, car1, car2, car3, truck};


        double total = GasStation.calcTotalGas(transports);


        System.out.println("Total gas: " + total);
    }
}
