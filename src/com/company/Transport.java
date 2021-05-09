package com.company;

public class Transport {

    static int horsePower;
    static int maxSpeed;
    static int weight;
    static String model;

    public static int output(int horsePower){
        return (int) (horsePower * 0.74);
    }
}
