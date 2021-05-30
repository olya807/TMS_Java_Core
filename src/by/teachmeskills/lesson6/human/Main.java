package by.teachmeskills.lesson6.human;

import by.teachmeskills.lesson6.human.jacket.Coat;
import by.teachmeskills.lesson6.human.jacket.Raincoat;
import by.teachmeskills.lesson6.human.shoes.Boots;
import by.teachmeskills.lesson6.human.shoes.Sandals;
import by.teachmeskills.lesson6.human.trousers.Jeans;
import by.teachmeskills.lesson6.human.trousers.Pants;

public class Main {

    public static void main(String[] args) {

        Coat coat = new Coat();
        Raincoat raincoat = new Raincoat();

        Boots boots = new Boots();
        Sandals sandals = new Sandals();

        Jeans jeans = new Jeans();
        Pants pants = new Pants();

        Human human = new Human("John", coat, boots, pants);

        human.putOnClothes();
        human.takeOffClothes();

        human.setName("Sam");
        human.setJacket(raincoat);
        human.setShoes(sandals);
        human.setTrousers(jeans);

        human.putOnClothes();
    }
}
