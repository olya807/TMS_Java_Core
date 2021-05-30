package by.teachmeskills.lesson6.robot.legs;

public class SamsungLegs implements ILeg{

    private int price;

    public SamsungLegs(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    };

    @Override
    public void makeStep(){
        System.out.println("Samsung legs are moving.");
    };
}
