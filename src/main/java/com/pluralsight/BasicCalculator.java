package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        //create a scanner
        Scanner theScanner = new Scanner(System.in);

        //some header for the user
        System.out.println("Enter two numbers: ");

        //ask for the first number
        System.out.print("First number: ");
        int firstNumber = theScanner.nextInt();

        //ask for the second number
        System.out.print("Second number: ");
        int secondNumber = theScanner.nextInt();


        System.out.println("\n");


        //Options Menu
        System.out.println("Possible Calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.print("Please select an option: ");
        String option = theScanner.next();

        //multiply the numbers
        int product = firstNumber * secondNumber;
        System.out.println("The product is: " + product);

        //add the numbers
        //int sum = firstNumber + secondNumber;
        //System.out.println("The sum is: " + sum);

        //Answer verification
        //System.out.println("Is the answer correct? (Yes/No): ");

        //String answer = theScanner.next();
        //System.out.println("You answered: " + answer);

    }
}
