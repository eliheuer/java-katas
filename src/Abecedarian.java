// Exercise 4: Eli Heuer, CMP167 Project 2

import java.util.*;

/**
 *
 * A word is said to be “abecedarian” if the letters in the word appear 
 * in alphabetical order. For example, the following are all six-letter 
 * English abecedarian words: 
 * 
 * abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow, 
 * bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort, deinos, diluvy, 
 *
 * Write a method called isAbecedarian that takes a String and returns a boolean 
 * indicating whether the word is abecedarian. Your method can be iterative or 
 * recursive.
 *
 *@author Eli Heuer, elih@protonmail.com
 *
 */
public class Abecedarian {
    public static void main(String[] args) {

	// Initialize variables:
	String userText = null;

	// Get user input:
	Scanner in = new Scanner(System.in);
        System.out.println("Examples of abecedarians: abdest, acknow");
	System.out.print("\nEnter phrase: ");
	userText = in.nextLine();

	// Test input:
	boolean abTest = isAbecedarian(userText);

        // Print boolean result:
	if (abTest) {
	    System.out.println("\n"+userText+" is an abecedarian.");
	} else {
	    System.out.println("\n"+userText+" is not an abecedarian.");
	}
    }
    
    // Returns true is word is an abecedarian:
    public static boolean isAbecedarian (String word) {

	// Check if word is a usable string:
        int length = word.length();
	if (length <= 1) {
	    return true;
	}
        
        // Initialize variables:
	char previous;
	char current;

        // Test is word is abecedarian:
	for (int i = 1; i < length; ++i) {
	    previous = word.charAt(i - 1);
	    current = word.charAt(i);
	    if (previous > current) {
		return false;
	    }
	}
    return true;
    }
}
