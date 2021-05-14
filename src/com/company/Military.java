package com.company;

public class Military extends Air {

    boolean isCatapultPresent;
    int missileAmount;

    public String characteristics(){
        return String.format("Is catapult present: %s.\r\nMissile amount is %s.\r\nOutput value is %s kW.",
                isCatapultPresent, missileAmount, output(horsePower));
    }

    public void shot(){
        if(missileAmount > 0){
            System.out.println("The missile fired.");
        }
        else{
            System.out.println("There is no ammunition.");
        }
    }

    public void catapulting(){
        if(isCatapultPresent){
            System.out.println("Catapulting was successful.");
        } else {
            System.out.println("You don't have catapulting system.");
        }
    }
}
