package com.company;

public class Lesson3 {

    public void Task1(){
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

}
