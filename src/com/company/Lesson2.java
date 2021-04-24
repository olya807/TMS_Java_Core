package com.company;

import java.util.Scanner;

public class Lesson2 {

    public void Task1() {

        //000=0
        //1010=10
        //1=1
        //1000=8
        //110011=51
        //1111111=127
        //11111111=255

        //44=101100
        //777=1100001001
        //2342=100100100110
        //655=1010001111
        //52=110100
        //5=101
        //22222=101011011001110
    }

    public void Task2(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter four-digit number: ");

        char[] data = String.valueOf(input.next()).toCharArray();

        if (data[0] != data[1] && data[1] != data[2] && data[2] != data[3] && data[0] != data[2] && data[0] != data[3] && data[1] != data[3]) {
            System.out.println("All digits are different");
        } else {
            System.out.println("Not all digits are different");
        }
    }

    public void Task3() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = input.nextInt();

        char[] data = String.valueOf(number).toCharArray();
        int arrayLength = data.length;

        if (arrayLength == 3) {
            System.out.println("The number is three-digit");
        } else {
            System.out.println("The number is not three-digit");
        }

        if (data[arrayLength - 1] == '7') {
            System.out.println("The last number is 7");
        } else {
            System.out.println("The last number is not 7");
        }

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }
    }

    public void Task4() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value 'a': ");
        int a = input.nextInt();

        System.out.println("Enter value 'b': ");
        int b = input.nextInt();

        System.out.println("Enter value 'c': ");
        int c = input.nextInt();

        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("The triangle is real");
        } else {
            System.out.println("The triangle is not real");
        }
    }

    public void Task5() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = input.nextInt();

        if (number > 0) {
            System.out.println(number + 1);
        } else if (number < 0) {
            System.out.println(number - 2);
        } else {
            System.out.println(10);
        }
    }

    public void Task6() {

        String result = "The biggest number is: ";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = input.nextInt();

        System.out.println("Enter the second number: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println(result + a);
        } else if (a < b) {
            System.out.println(result + b);
        } else {
            System.out.println("Number " + a + " is equal to number " + b);
        }
    }
}
