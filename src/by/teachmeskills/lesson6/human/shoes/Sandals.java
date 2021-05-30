package by.teachmeskills.lesson6.human.shoes;

public class Sandals implements IShoes {

    public void putOn(String name){
        System.out.println(name + " puts the sandals on.");
    }

    public void takeOff(String name){
        System.out.println(name + " takes the sandals off.");
    }
}
