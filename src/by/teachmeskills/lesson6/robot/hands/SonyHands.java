package by.teachmeskills.lesson6.robot.hands;

public class SonyHands implements IHand {

    private int price;

    public SonyHands(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    };

    @Override
    public void shakeHand(){
        System.out.println("Sony hands are shaking.");
    };
}
