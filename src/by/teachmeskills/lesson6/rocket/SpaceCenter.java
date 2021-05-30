package by.teachmeskills.lesson6.rocket;

import by.teachmeskills.lesson6.rocket.spaceships.IStart;

public class SpaceCenter {

    IStart start;

    public IStart getStart() {
        return start;
    }

    public void setStart(IStart start) {
        this.start = start;
    }

    public SpaceCenter(IStart start) {
        this.start = start;
    }

    public void start() {
        if(start.initialCheck()){
            start.engineLaunch();
            for (int i = 10; i > 0; i--){
                System.out.println(i);
            }
            start.launch();
        } else {
            System.out.println("Initial check failed!");
        }
    }
}
