package by.itstep.goutor.javalesson.lesson27.gasstation2.model.logic;

import by.itstep.goutor.javalesson.lesson27.gasstation2.model.data.Transport;

public class GasStation {
    public static double calcTotalGas(Transport[] transports) {

        double total = 0;

        for (Transport car : transports) {
            total += car.getTank();
        }


        return total;
    }

}
