// Exercise 2: Eli Heuer, CMP167 Project 2

import java.util.*;

/**
 *
 * Write a full program that asks the user to enter an integer
 * and prints all its divisors in ascending order. That is,
 * list all numbers that divide the given number, sorted from
 * smallest to largest. You may assume the user enters a
 * positive integer.
 * 
 * An example is shown below, where the user entered 30:
 *
 * Enter a number: 30
 * The divisors are: 1 2 3 5 6 10 15 30
 *
 *@author Eli Heuer, elih@protonmail.com
 *
 */

// Enter an integer and prints all its divisors:
public class DivisorList {    
    public static void main(String[] args) {

	// Get integer input:
	int input = 0;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a number: ");
	input = in.nextInt();

	// Get divisor list
	String divisors = getDivisors(input);

        // Print result from getDivisors();
        System.out.println("\nThe divisors are: "+divisors);

    }

    public static String getDivisors(int input) {
	
        // Print the divisor list:
        StringBuilder divisors = new StringBuilder();
        for (int i=1;i<=input;i++) {
            if (input % i == 0) {
                divisors.append(i).append(", ");
            }
        }
        
        // Remove the last comma and space:
        if(0 < (divisors.length())) {
            divisors.deleteCharAt(divisors.length()-2);
        }
        
        // Return a string to the main method:
        return divisors.toString();
    }
}
