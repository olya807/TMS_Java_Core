package by.teachmeskills.lesson5;

public class Cargo extends Ground {

    int carryingCapacity;

    public String characteristics() {
        return String.format("Carrying capacity is %s.\r\nOutput value is %s kW.",
                carryingCapacity, output());
    }

    public void checkCargoAmount(int cargoAmount) {
        if (cargoAmount <= carryingCapacity) {
            System.out.println("The truck is loaded.");
        } else {
            System.out.println("You need a bigger truck.");
        }
    }
}
