package by.teachmeskills.lesson6.human.jacket;

public class Raincoat implements IJacket {

    public void putOn(String name){
        System.out.println(name + " puts the raincoat on.");
    }

    public void takeOff(String name){
        System.out.println(name + " takes the raincoat off.");
    }
}
