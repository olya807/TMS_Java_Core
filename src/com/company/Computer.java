package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Computer {

    String processor = "Intel";
    String ram = "8 Gb";
    String hdd = "500 Gb";
    int resource = 2;

    //the flag is 'false' by default
    boolean isBlewUp;

    //the flag is 'false' by default
    boolean isPcTurnedOn;

    //count number of turn on/off cycles
    int runCycles = 1;

    //store user input from console
    int userChoice;
    String blewUpMessage = "\r\n\r\nSorry, you have run out of resource cycles. The PC has blew up.";

    public void pcDescription() {

        System.out.printf(
                "PC characteristics are:\r\nProcessor - %s\r\nRAM - %s\r\nHDD - %s\r\nResource cycles - %s",
                processor, ram, hdd, resource);
    }

    public void turnOnPc() {

        if (runCycles > resource) {
            System.out.println(blewUpMessage);
        }
        //if PC blew up then show a message that it's blew up
        else if (isBlewUp) {
            System.out.println("\r\n\r\nThe PC blew up. You can't turn it on.");
        }
        //if PC is not blew up and it's not turned on then guess the number and turn it on if you are lucky
        else if (!isPcTurnedOn) {
            tryAndGuessNumber("on", true);
        }
        //if PC is turned on then show a message that you should turn it off first
        else {
            System.out.println("\r\n\r\nThe PC is already turned on. First turn it off.");
        }
    }

    public void turnOffPc() {

        if (runCycles > resource) {
            System.out.println(blewUpMessage);
        }
        //if PC blew up then show a message that it's blew up
        else if (isBlewUp) {
            System.out.println("\r\n\r\nThe PC blew up. You can't turn it off.");
        }
        //if PC is not blew up and it's turned on then guess the number and turn it off if you are lucky
        else if (isPcTurnedOn) {
            tryAndGuessNumber("off", false);
            runCycles++;
        }
        //if PC is turned off then show a message that you should turn it on first
        else {
            System.out.println("\r\n\r\nThe PC is already turned off. First turn it on.");
        }
    }

    private void tryAndGuessNumber(String turnedOnOff, boolean isStateOn) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //store application random choice '0' or '1'
        int pcChoice = random.nextInt(2);

        //check if console input = int
        try {
            System.out.printf("\r\n\r\nTo turn %s PC, please, enter '0' or '1': ", turnedOnOff);
            userChoice = scanner.nextInt();
        }
        //if user entered not int values then show the following message
        catch (InputMismatchException exception) {
            System.out.println("\r\n\r\nSorry, you can only enter digits.");
        }

        if (runCycles > resource) {
            System.out.println(blewUpMessage);
        }
        //check if user entered either '0' or '1'
        else if (userChoice == 0 || userChoice == 1) {

            //if user entered the same number as application did but PC blew up then show the following message
            if (userChoice == pcChoice && isBlewUp) {
                System.out.printf("The PC has already blew up but you guessed the number '%s'.", pcChoice);
            }
            //if user entered a different number than application did and PC blew up then show the following message
            else if (userChoice != pcChoice && isBlewUp) {
                System.out.printf("The PC has already blew up and you didn't guess the number '%s'.", pcChoice);
            }
            //if user entered the same number as application did then turn the PC on or off
            else if (userChoice == pcChoice) {
                //save PC state as 'turned on' or 'turned off'
                isPcTurnedOn = isStateOn;
                System.out.printf("Congrats! You guessed the number '%s'. The PC is turned %s.", pcChoice, turnedOnOff);
            } else {
                //save PC state as 'blew up'
                isBlewUp = true;
                System.out.printf("You didn't guess the number '%s'. The PC has blew up.", pcChoice);
            }
        } else {
            System.out.println("\r\n\r\nSorry, you can only enter '0' or '1'. Please, try again.");
        }
    }
}