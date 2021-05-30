package by.teachmeskills.lesson6.human.trousers;

public class Pants implements ITrousers {

    @Override
    public void putOn(String name){
        System.out.println(name + " puts the trousers on.");
    }

    @Override
    public void takeOff(String name){
        System.out.println(name + " takes the trousers off.");
    }
}
