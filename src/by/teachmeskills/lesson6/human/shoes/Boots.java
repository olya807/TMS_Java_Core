package by.teachmeskills.lesson6.human.shoes;

public class Boots implements IShoes {

    @Override
    public void putOn(String name){
        System.out.println(name + " puts the boots on.");
    }

    @Override
    public void takeOff(String name){
        System.out.println(name + " takes the boots off.");
    }
}
