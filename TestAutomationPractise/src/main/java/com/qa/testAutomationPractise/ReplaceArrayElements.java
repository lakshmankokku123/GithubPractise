package com.qa.testAutomationPractise;
import java.util.Scanner;

public class ReplaceArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the array
        System.out.println("Enter the elements of the array separated by commas (e.g., 0,0,1,0,1,1,0,1):");
        String[] inputArray = scanner.nextLine().split(",");
        
        // Replace elements according to the given conditions
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals("1")) {
                if (i % 2 == 0)
                    inputArray[i] = "a";
                else
                    inputArray[i] = "A";
            } else if (inputArray[i].equals("0")) {
                if (i % 2 == 0)
                    inputArray[i] = "z";
                else
                    inputArray[i] = "Z";
            }
        }
        
        // Output the modified array
        System.out.println("Modified Array:");
        for (String element : inputArray) {
            System.out.print(element + " ");
        }
    }
}
