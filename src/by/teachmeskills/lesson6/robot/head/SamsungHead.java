package by.teachmeskills.lesson6.robot.head;

public class SamsungHead implements IHead {

    private int price;

    public SamsungHead(int price){
        this.price = price;
    }

    @Override
    public void speak(){
        System.out.println("Samsung head is talking.");
    };

    @Override
    public int getPrice(){
        return price;
    };
}
