package by.teachmeskills.lesson6.robot;

import by.teachmeskills.lesson6.robot.hands.IHand;
import by.teachmeskills.lesson6.robot.head.IHead;
import by.teachmeskills.lesson6.robot.legs.ILeg;

public class Robot implements IRobot {

    private IHead head;
    private IHand hand;
    private ILeg leg;

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public Robot(IHead head, IHand hand, ILeg leg){
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void action(){
        head.speak();
        hand.shakeHand();
        leg.makeStep();
    };

    @Override
    public int getPrice(){
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    };
}
