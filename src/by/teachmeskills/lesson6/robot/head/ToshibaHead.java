package by.teachmeskills.lesson6.robot.head;

public class ToshibaHead implements IHead {

    private int price;

    public ToshibaHead(int price){
        this.price = price;
    }

    @Override
    public void speak(){
        System.out.println("Toshiba head is talking.");
    };

    @Override
    public int getPrice(){
        return price;
    };
}