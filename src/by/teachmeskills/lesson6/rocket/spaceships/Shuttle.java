package by.teachmeskills.lesson6.rocket.spaceships;

import java.util.Random;

public class Shuttle implements IStart {

    public boolean initialCheck() {
        boolean status = false;
        Random random = new Random();

        //randomNumber from '0' to '10'
        if (random.nextInt(11) > 3)
            status = true;

        return status;
    }

    public void engineLaunch() {
        System.out.println("Space shuttle engines are launched. All systems are OK!");
    }

    public void launch() {
        System.out.println("Shuttle launch!!!");
    }
}
