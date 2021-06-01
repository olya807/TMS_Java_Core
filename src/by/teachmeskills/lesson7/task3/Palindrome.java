package by.teachmeskills.lesson7.task3;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Palindrome {

    private List<String> inputData;
    private List<String> outputData;

    public List<String> getInputData() {
        return inputData;
    }

    public void setInputData(List<String> inputData) {
        this.inputData = inputData;
    }

    public List<String> getOutputData() {
        return outputData;
    }

    public void setOutputData(List<String> outputData) {
        this.outputData = outputData;
    }

    public Palindrome(List<String> inputData, List<String> outputData) {
        this.inputData = inputData;
        this.outputData = outputData;
    }

    public void readFile(String fileInputPath) throws IOException {

        FileReader fr= new FileReader(fileInputPath);
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            inputData.add(scan.nextLine());
        }
    }

    public void isPalindrome(){
        for (String str: inputData) {

            int strLength = str.length();
            StringBuilder reverseStr = new StringBuilder();

            for (int i = (strLength - 1); i >=0; --i) {
                reverseStr.append(str.charAt(i));
            }

            if (str.toLowerCase().equals(reverseStr.toString().toLowerCase())) {
                System.out.println(str + " is a Palindrome.");
                outputData.add(str);
            }
            else {
                System.out.println(str + " is not a Palindrome.");
            }
        }
    }

    public void writeToFile(String fileOutPutPath, List<String> outputData) throws IOException {
        FileWriter fw = new FileWriter(fileOutPutPath);

        for (String str : outputData) {
            fw.write(str + "\n");
        }

        fw.close();
    }
}
