package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // 1. First number
        System.out.print("First number: ");
        int firstNumber = sc.nextInt();

        // 2. Operator
        System.out.print("Operator (+, -, *, /): ");
        String option = sc.next();

        // 3. Second number
        System.out.print("Second number: ");
        int secondNumber = sc.nextInt();

        // 4. Calculate
        switch (option) {
            case "+" -> System.out.println("The sum is: " + (firstNumber + secondNumber));
            case "-" -> System.out.println("The difference is: " + (firstNumber - secondNumber));
            case "*" -> System.out.println("The product is: " + (firstNumber * secondNumber));
            case "/" -> {
                if (secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("The quotient is: " + (double) firstNumber / secondNumber);
                }
            }
            default -> System.out.println("Invalid operator.");
        }

    }
}
