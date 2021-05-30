package by.teachmeskills.lesson6.rocket;

import by.teachmeskills.lesson6.rocket.spaceships.Shuttle;
import by.teachmeskills.lesson6.rocket.spaceships.SpaceX;

public class Main {

    public static void main(String[] args){

        Shuttle shuttle = new Shuttle();
        SpaceCenter spaceCenter1 = new SpaceCenter(shuttle);
        spaceCenter1.start();

        SpaceX spaceX = new SpaceX();
        SpaceCenter spaceCenter2 = new SpaceCenter(spaceX);
        spaceCenter2.start();
    }
}
