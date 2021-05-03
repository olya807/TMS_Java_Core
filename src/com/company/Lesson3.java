package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson3 {

    static String newLine = "\r\n";
    static String skip2Lines = newLine + newLine;

    public void task1() {
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

    public void task2() {

        List<Integer> evenNumbers = new ArrayList<>();

        int n = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                evenNumbers.add(n, i);
                n++;
            }
        }

        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }

        System.out.print(newLine);

        for (int i = evenNumbers.size() - 1; i >= 0; i--) {
            System.out.print(evenNumbers.get(i) + " ");
        }
    }

    public void task3() {

        List<Integer> randomNumbers = new ArrayList<>();
        int evenNumbersAmount = 0;

        //generate random values from 0-99
        CreateRandomNumbersList(randomNumbers, 14, 100);

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

    public void task4() {

        List<Integer> randomNumbers = new ArrayList<>();

        //generate random values from 0-20
        CreateRandomNumbersList(randomNumbers, 19, 21);

        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + " ");
        }

        System.out.print(skip2Lines);

        for (int index = 1; index <= randomNumbers.size(); index++) {
            if (index % 2 != 0) {
                randomNumbers.set(index, 0);
            }
        }

        for (int randomNumber : randomNumbers) {
            System.out.print(randomNumber + " ");
        }
    }

    public void task5() {

        String firstAverageString = "The 1st List Arithmetic Average: ";
        String secondAverageString = "The 2nd List Arithmetic Average: ";

        List<Integer> randomNumbersFirst = new ArrayList<>();
        List<Integer> randomNumbersSecond = new ArrayList<>();

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

    public void task6() {

    }

    public void task7() {

        List<Integer> randomNumbers = new ArrayList<>();

        //generate random values from 0-15
        CreateRandomNumbersList(randomNumbers, 11, 16);

        PrintListValues(randomNumbers, "The random numbers list: ");

        int elementMaxValueIndex = 0;

        for (int index = 1; index < randomNumbers.size() - 1; index++) {
            if (randomNumbers.get(elementMaxValueIndex) <= randomNumbers.get(index)) {
                elementMaxValueIndex = index;
            }
        }

        System.out.printf("\r\nIndex of the max element %s is %s", randomNumbers.get(elementMaxValueIndex), elementMaxValueIndex);
    }

    private static void CreateRandomNumbersList(List<Integer> listName, int arrayLength, int randomNumbersMaxRange) {
        Random random = new Random();

        for (int i = 0; i <= arrayLength; i++) {
            listName.add(i, random.nextInt(randomNumbersMaxRange));
        }
    }

    private static void PrintListValues(List<Integer> listName, String message) {
        System.out.print(skip2Lines + message);

        for (int randomNumber : listName) {
            System.out.print(randomNumber + " ");
        }
    }

    private static int CalculateArithmeticAverage(List<Integer> listName) {
        int sumNumbers = 0;

        for (int value : listName) {
            sumNumbers += value;
        }

        return sumNumbers / listName.size();
    }
}
