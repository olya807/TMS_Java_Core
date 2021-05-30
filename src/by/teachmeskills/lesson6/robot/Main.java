package by.teachmeskills.lesson6.robot;

import by.teachmeskills.lesson6.robot.hands.*;
import by.teachmeskills.lesson6.robot.head.*;
import by.teachmeskills.lesson6.robot.legs.*;

public class Main {
    public static void main(String[] args){

        SamsungHead samsungHead = new SamsungHead(12);
        SonyHead sonyHead = new SonyHead(25);
        ToshibaHead toshibaHead = new ToshibaHead(18);

        SamsungHands samsungHands = new SamsungHands(10);
        SonyHands sonyHands = new SonyHands(7);
        ToshibaHands toshibaHands = new ToshibaHands(14);

        SamsungLegs samsungLegs = new SamsungLegs(8);
        SonyLegs sonyLegs = new SonyLegs(15);
        ToshibaLegs toshibaLegs = new ToshibaLegs(10);

        //First robot
        Robot robot1 = new Robot(samsungHead, sonyHands, toshibaLegs);
        robot1.action();
        int price1 = robot1.getPrice();
        System.out.println(price1);

        robot1.setHead(sonyHead);
        robot1.setHand(samsungHands);
        robot1.setLeg(sonyLegs);
        robot1.action();
        System.out.println(robot1.getPrice());

        //Second robot
        Robot robot2 = new Robot(toshibaHead, samsungHands, sonyLegs);
        robot2.setHand(sonyHands);
        robot2.action();
        System.out.println(robot2.getPrice());

        //Third robot
        Robot robot3 = new Robot(sonyHead, toshibaHands, samsungLegs);
        robot3.action();
        System.out.println(robot3.getPrice());
    }
}
