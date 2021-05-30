package by.teachmeskills.lesson3;

import java.lang.reflect.Array;
import java.util.*;

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

        int[] randomNumbers = new int[4];
        boolean isAscending = true;

        //generate random values from 0-10
        CreateRandomNumbersList(randomNumbers, 3, 11);

        PrintListValues(randomNumbers, "The random numbers list: ");

        for (int i = 0; i < randomNumbers.length - 1; i++) {
            if (randomNumbers[i] >= randomNumbers[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("The sequence is strictly ascending.");
        } else {
            System.out.println("The sequence is not strictly ascending.");
        }

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

    public static void task8() {

        Scanner input = new Scanner(System.in);
        int arrayLength;

        do {
            System.out.println("Please enter array length (should be a positive number): ");
            arrayLength = input.nextInt();
        } while (arrayLength <= 0);

        int[] array = new int[arrayLength];
        int firstPart = 0;
        int secondPart = 0;

        //generate random values from 0-15
        CreateRandomNumbersList(array, arrayLength - 1, 16);

        PrintListValues(array, "The random numbers list: ");

        for (int i = 0; i < arrayLength / 2; i++)
            firstPart = firstPart + array[i];

        for (int i = arrayLength - 1; i > arrayLength / 2; i--)
            secondPart = secondPart + array[i];

        if (firstPart > secondPart) {
            System.out.printf("The first part '%s' is bigger than the second part '%s'.", firstPart, secondPart);
        } else if (firstPart < secondPart) {
            System.out.printf("The first part '%s' is smaller than the second part '%s'.", firstPart, secondPart);
        } else {
            System.out.printf("The first '%s' and the second part '%s' are equal.", firstPart, secondPart);
        }
    }

    public static void task9() {

        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.println("Please enter a number bigger than 3: ");
            n = input.nextInt();
        } while (n <= 3);

        int[] randomNumbers = new int[n];

        //generate random values from 0-n
        CreateRandomNumbersList(randomNumbers, randomNumbers.length - 1, n + 1);

        PrintListValues(randomNumbers, "The random numbers list: ");

        int evenNumbersAmount = 0;

        for (int randomNumber : randomNumbers) {
            if (randomNumber % 2 == 0 && randomNumber > 0) {
                evenNumbersAmount += 1;
            }
        }

        int i = 0;
        int[] evenNumbersArray = new int[evenNumbersAmount];
        for (int randomNumber : randomNumbers) {
            if (randomNumber % 2 == 0 && randomNumber > 0) {
                evenNumbersArray[i] = randomNumber;
                i++;
            }
        }

        PrintListValues(evenNumbersArray, "The even numbers list: ");
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

        System.out.println(skip2Lines);
    }

    private static int CalculateArithmeticAverage(int[] listName) {
        int sumNumbers = 0;

        for (int value : listName) {
            sumNumbers += value;
        }

        return sumNumbers / listName.length;
    }
}
