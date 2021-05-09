package com.company;

public class Military extends Air {

    static boolean isCatapultPresent;
    static int missileAmount;

    public static String characteristics(){
        return String.format("Is catapult present: %s.\r\nMissile amount is %s.\r\nOutput value is %s kW.",
                isCatapultPresent, missileAmount, output(horsePower));
    }

    public static void shot(){
        if(missileAmount > 0){
            System.out.println("The missile fired.");
        }
        else{
            System.out.println("There is no ammunition.");
        }
    }

    public static void catapulting(){
        if(isCatapultPresent){
            System.out.println("Catapulting was successful.");
        } else {
            System.out.println("You don't have catapulting system.");
        }
    }
}
