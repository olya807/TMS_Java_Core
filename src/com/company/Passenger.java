package com.company;

public class Passenger extends Ground {

    String bodyType;
    int passengersAmount;
    int distance;

    public String characteristics() {
        return String.format("Body type is %s.\r\nPassengers amount is %s.\r\nOutput value is %s kW.",
                bodyType, passengersAmount, output());
    }

    public void kilometersAmount(int time) {
        distance = time * maxSpeed;

        System.out.printf("During %s hour(s) the car %s moving %s km/h will cover %s km and consume %s l of fuel.",
                time, model, maxSpeed, distance, fuelConsumption(distance));
    }

    private int fuelConsumption(int distance) {
        return distance / 100 * fuelConsumption;
    }
}
