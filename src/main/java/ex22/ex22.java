package ex22;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;
//Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.
//
//Example Output
//Enter the first number: 1
//Enter the second number: 51
//Enter the third number: 2
//The largest number is 51.
//Constraint
//Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
public class ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int numOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int numTwo = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int numThree = scanner.nextInt();
        if(numOne == numTwo || numOne == numThree || numTwo == numThree)
        {
            return;
        }
        int numLargest = numOne;
        if(numLargest < numTwo)
        {
            numLargest = numTwo;
        }
        if(numLargest < numThree)
        {
            numLargest = numThree;
        }
        System.out.println("The largest number is "+numLargest+".");
    }
}
