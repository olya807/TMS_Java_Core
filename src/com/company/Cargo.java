package com.company;

public class Cargo extends Ground {

    static int carryingCapacity;

    public static String characteristics(){
        return String.format("Carrying capacity is %s.\r\nOutput value is %s kW.",
                carryingCapacity, output(horsePower));
    }

    public static void checkCargoAmount(int cargoAmount){
        if(cargoAmount <= carryingCapacity){
            System.out.println("The truck is loaded.");
        }
        else{
            System.out.println("You need a bigger truck.");
        }
    }
}
