package com.company;

public class Transport {

    int horsePower;
    int maxSpeed;
    int weight;
    String model;

    public int output(int horsePower){
        return (int) (horsePower * 0.74);
    }
}
