package by.teachmeskills.lesson6.robot.legs;

public class ToshibaLegs implements ILeg{

    private int price;

    public ToshibaLegs(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    };

    @Override
    public void makeStep(){
        System.out.println("Toshiba legs are moving.");
    };
}
