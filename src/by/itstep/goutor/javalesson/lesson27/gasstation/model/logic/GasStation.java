package by.itstep.goutor.javalesson.lesson27.gasstation.model.logic;

import by.itstep.goutor.javalesson.lesson27.gasstation.model.data.Bus;
import by.itstep.goutor.javalesson.lesson27.gasstation.model.data.Car;
import by.itstep.goutor.javalesson.lesson27.gasstation.model.data.Truck;

public class GasStation {
    public static double calcTotalGas(Car[] cars, Bus[] buses, Truck[] trucks) {

        double total = 0;

        for (var car : cars) {
            total += car.getTank();
        }

        for (var bus : buses) {
            total += bus.getTank();
        }

        for (var truck : trucks) {
            total += truck.getTank();
        }
        return total;
    }
}
