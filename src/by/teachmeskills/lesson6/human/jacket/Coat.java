package by.teachmeskills.lesson6.human.jacket;

public class Coat implements IJacket {

    @Override
    public void putOn(String name){
        System.out.println(name + " puts the coat on.");
    }

    @Override
    public void takeOff(String name){
        System.out.println(name + " takes the coat off.");
    }
}
