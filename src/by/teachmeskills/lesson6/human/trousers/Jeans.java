package by.teachmeskills.lesson6.human.trousers;

public class Jeans implements ITrousers {

    @Override
    public void putOn(String name){
        System.out.println(name + " puts the jeans on.");
    }

    @Override
    public void takeOff(String name){
        System.out.println(name + " takes the jeans off.");
    }
}
