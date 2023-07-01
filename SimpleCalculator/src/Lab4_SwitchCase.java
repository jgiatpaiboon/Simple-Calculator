/*
 *  Assignment Lab 4
 *  Description: This program is a simple calculator that has the functions of +, *, -, /, %, and ^.
 *  Name: James Giatpaiboon
 *  ID: 917848716
 *  Class: CSC 211-03
 *  Semester: Fall 2019
 */

import java.util.Scanner;   // imported scanner for user

public class Lab4_SwitchCase {
    public static void main (String[] args) {
        //declared double variables for first and second number inputted, along with the result
        double numb1, numb2;
        double result;

        Scanner input = new Scanner(System.in); // for user to input

        // tells user to choose an operation to use
        System.out.println("Enter an operation (either +, -, *, /, %, or ^ " + ":");
        char operator = input.next().charAt(0); // stores input for the operation chosen

        System.out.println("Enter your first number");  // prompts user to input first number
        numb1 = input.nextDouble(); // stores input for first number entered

        System.out.println("Enter your second number"); // prompts user to input second number
        numb2 = input.nextDouble(); // stores input for the second number entered

        // switch cases used for operator to perform calculations in the program
        switch (operator) {
            case '+':
                result = numb1 + numb2;
                break;

            case '-':
                result = numb1 - numb2;
                break;

            case '*':
                result = numb1 * numb2;
                break;

            case '/':
                result = numb1 / numb2;
                break;
            case '%':
                result = numb1 % numb2;
                break;
            case '^':
                result = Math.pow(numb1, numb2);
                break;
            default:    // prints statement if user inputs an invalid operation into the program
                System.out.println("Invalid operator, try again.");
                return;



        }
        System.out.println("Answer: " + result);    // prints out the final results for the user

    }
}