package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson3 {

    static String newLine = "\r\n";
    static String skip2Lines = newLine + newLine;

    public static void task1() {
        int[] evenNumbers = new int[10];

        int n = 0;
        for (int i = 2; i <= 20; i += 2) {
            evenNumbers[n] = i;
            n++;
        }

        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }

        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }

    public static void task2() {

        int[] evenNumbers = new int[50];

        int n = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                evenNumbers[n] = i;
                n++;
            }
        }

        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }

        System.out.print(newLine);

        for (int i = evenNumbers.length - 1; i >= 0; i--) {
            System.out.print(evenNumbers[i] + " ");
        }
    }

    public static void task3() {

        int[] randomNumbers = new int[15];
        int evenNumbersAmount = 0;

        //generate random values from 0-99
        CreateRandomNumbersList(randomNumbers, 14, 100);

        System.out.print(skip2Lines);

        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + " ");
        }

        System.out.print(skip2Lines);

        for (int randomNumber : randomNumbers) {
            if (randomNumber % 2 == 0) {
                evenNumbersAmount++;
            }
        }

        System.out.print("The amount of even numbers is: " + evenNumbersAmount + newLine);
    }

    public static void task4() {

        int[] randomNumbers = new int[20];

        //generate random values from 0-20
        CreateRandomNumbersList(randomNumbers, 19, 21);

        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + " ");
        }

        System.out.print(skip2Lines);

        for (int index = 1; index <= randomNumbers.length; index++) {
            if (index % 2 != 0) {
                randomNumbers[index] = 0;
            }
        }

        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + " ");
        }
    }

    public static void task5() {

        String firstAverageString = "The 1st List Arithmetic Average: ";
        String secondAverageString = "The 2nd List Arithmetic Average: ";

        int[] randomNumbersFirst = new int[5];
        int[] randomNumbersSecond = new int[5];

        //generate random values from 0-15
        CreateRandomNumbersList(randomNumbersFirst, 4, 16);
        CreateRandomNumbersList(randomNumbersSecond, 4, 16);

        PrintListValues(randomNumbersFirst, "The first RandomList: ");
        PrintListValues(randomNumbersSecond, "The second RandomList: ");

        int averageValueFirst = CalculateArithmeticAverage(randomNumbersFirst);
        int averageValueSecond = CalculateArithmeticAverage(randomNumbersSecond);

        if (averageValueFirst > averageValueSecond) {
            System.out.println(skip2Lines + firstAverageString + averageValueFirst + " > " + secondAverageString + averageValueSecond);
        } else if (averageValueFirst < averageValueSecond) {
            System.out.println(skip2Lines + firstAverageString + averageValueFirst + " < " + secondAverageString + averageValueSecond);
        } else {
            System.out.println(skip2Lines + firstAverageString + averageValueFirst + " = " + secondAverageString + averageValueSecond);
        }
    }

    public static void task6() {

    }

    public static void task7() {

        int[] randomNumbers = new int[12];

        //generate random values from 0-15
        CreateRandomNumbersList(randomNumbers, 11, 16);

        PrintListValues(randomNumbers, "The random numbers list: ");

        int elementMaxValueIndex = 0;

        for (int index = 1; index < randomNumbers.length - 1; index++) {
            if (randomNumbers[elementMaxValueIndex] <= randomNumbers[index]) {
                elementMaxValueIndex = index;
            }
        }

        System.out.printf("\r\nIndex of the max element %s is %s", randomNumbers[elementMaxValueIndex], elementMaxValueIndex);
    }

    private static void CreateRandomNumbersList(int[] listName, int arrayLength, int randomNumbersMaxRange) {
        Random random = new Random();

        for (int i = 0; i <= arrayLength; i++) {
            listName[i] = random.nextInt(randomNumbersMaxRange);
        }
    }

    private static void PrintListValues(int[] listName, String message) {
        System.out.print(skip2Lines + message);

        for (int randomNumber : listName) {
            System.out.print(randomNumber + " ");
        }
    }

    private static int CalculateArithmeticAverage(int[] listName) {
        int sumNumbers = 0;

        for (int value : listName) {
            sumNumbers += value;
        }

        return sumNumbers / listName.length;
    }
}
