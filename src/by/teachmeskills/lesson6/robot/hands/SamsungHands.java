package by.teachmeskills.lesson6.robot.hands;

public class SamsungHands implements IHand {

    private int price;

    public SamsungHands(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    };

    @Override
    public void shakeHand(){
        System.out.println("Samsung hands are shaking.");
    };
}
