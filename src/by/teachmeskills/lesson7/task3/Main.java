package by.teachmeskills.lesson7.task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static public List<String> inputData = new ArrayList<>();
    static public List<String> outputData = new ArrayList<>();

    static String inputFilePath = "src/by/teachmeskills/lesson7/task3/files/palindromeInit.txt";
    static String outputFilePath = "src/by/teachmeskills/lesson7/task3/files/palindromeProcessed.txt";

    public static void main(String[] args) throws IOException {

        Palindrome palindrome = new Palindrome(inputData, outputData);

        palindrome.readFile(inputFilePath);
        palindrome.isPalindrome();
        palindrome.writeToFile(outputFilePath, outputData);
    }
}
