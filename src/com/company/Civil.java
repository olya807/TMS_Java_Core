package com.company;

public class Civil extends Air {

    int maxPassengersAmount;
    boolean isBusinessClassPresent;

    public String characteristics(){
        return String.format("Passengers amount is %s.\r\nIs business class present: %s.\r\nOutput value is %s kW.",
                maxPassengersAmount, isBusinessClassPresent, output());
    }

    public void checkPassengersAmount(int passengersAmount){
        if(passengersAmount <= maxPassengersAmount){
            System.out.println("The airplane is loaded.");
        }
        else{
            System.out.println("You need a bigger airplane.");
        }
    }
}
