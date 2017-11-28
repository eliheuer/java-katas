// Exercise 1: Eli Heuer, CMP167 Project 2

import java.util.*;

/**
 *
 * Asks user for input, finds and counts double chars.
 *
 *@author Eli Heuer, elih@protonmail.com
 *
 */
public class CountDouble {
    public static void main(String[] args) {

	// Initialize variables:
	String userText = null;

	// Get user input:
	Scanner in = new Scanner(System.in);
	System.out.print("\nEnter phrase: ");
	userText = in.nextLine();

	// Check for double chars:
	checkForDouble(userText);
    }

    public static void checkForDouble(String string) {
       
	// Set double char count to zero:
	int doubleCount = 0; 
	    
	// Look for double chars:
	for (int i=0; i < string.length()-1; i++) {
	    if (i < string.length()) {
		char tempA = string.charAt(i);
		char tempB = string.charAt(i+1);
		if (tempA == tempB) {
		    doubleCount += 1;
		}
	    } else {
		System.out.println("Done...");
	    }
	}
	// Print the count of doubles:
	System.out.println("\nThere are "+doubleCount+" character doubles.");
    }
}

