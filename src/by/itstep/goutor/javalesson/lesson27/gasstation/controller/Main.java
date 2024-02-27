package by.itstep.goutor.javalesson.lesson27.gasstation.controller;

import by.itstep.goutor.javalesson.lesson27.gasstation.model.data.Bus;
import by.itstep.goutor.javalesson.lesson27.gasstation.model.data.Car;
import by.itstep.goutor.javalesson.lesson27.gasstation.model.data.Truck;
import by.itstep.goutor.javalesson.lesson27.gasstation.model.logic.GasStation;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("Scania", 50, 480);
        Bus bus2 = new Bus("Man", 55, 520);

        Car car1 = new Car("Bmw", 120, 50);
        Car car2 = new Car("Scoda", 115, 90);
        Car car3 = new Car("Honda", 250, 65);

        Truck truck = new Truck("Iveco", 12000, 28, 800);

        Bus[] buses = {bus1, bus2};
        Car[] cars = {car1, car2, car3};
        Truck[] trucks = {truck};

        double total = GasStation.calcTotalGas(cars, buses, trucks);


        System.out.println("Total gas: " + total);
    }
}
