package by.teachmeskills.lesson6.robot.hands;

public class ToshibaHands implements IHand {

    private int price;

    public ToshibaHands(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    };

    @Override
    public void shakeHand(){
        System.out.println("Toshiba hands are shaking.");
    };
}
