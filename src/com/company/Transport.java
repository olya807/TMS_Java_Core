package com.company;

public abstract class Transport {

    int horsePower;
    int maxSpeed;
    int weight;
    String model;

    public int output() {
        return (int) (horsePower * 0.74);
    }
}
