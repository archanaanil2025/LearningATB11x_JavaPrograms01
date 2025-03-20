package Archana_Automation;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the no whose factorial you want!"); // Prompt the user for input
        int number = scanner.nextInt(); // Read an integer input from the user

        int factorial = 1; // Initialize the factorial variable to 1
        if (number <= 0) { // Check if the number is less than or equal to 0
            System.out.println(factorial); // If true, print the factorial (which is 1)
        } else {
            // If the number is greater than 0, calculate the factorial
            for (int i = 1; i <= number; i++) { // Loop from 1 to the number
                factorial = factorial * i; // Multiply the current factorial value by i
            }
        }

        System.out.println("Factorial is -> " + factorial); // Print the calculated factorial
    }
    }
