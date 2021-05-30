package by.teachmeskills.lesson6.robot.legs;

public class SonyLegs implements ILeg{

    private int price;

    public SonyLegs(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    };

    @Override
    public void makeStep(){
        System.out.println("Sony legs are moving.");
    };
}
