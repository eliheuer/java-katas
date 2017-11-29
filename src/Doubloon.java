// Exercise 5: Eli Heuer, CMP167 Project 2

import java.util.*;

/**
 *
 * Takes a string and checks if it is a doubloon. 
 *
 *@author Eli Heuer, elih@protonmail.com
 *
 */
public class Doubloon {
    public static void main(String[] args) {

	// Initialize variables:
	String userText = null;

	// Get user input:
	Scanner in = new Scanner(System.in);
        System.out.println("Examples of doubloons: abba, redder, caucasus");
	System.out.print("\nEnter a word or phrase: ");
	userText = in.nextLine();

	// Test input:
	boolean doubloonTest = isDoubloon(userText);

        // Print boolean result:
	if (doubloonTest) {
	    System.out.println("\n"+userText+" is a doubloon.");
	} else {
	    System.out.println("\n"+userText+" is not a doubloon.");
	}
    }

    /** Returns true if input is a doubloon */
    public static boolean isDoubloon (String word) {

        // convert to lowercase, set flag:
        word = word.toLowerCase();
        boolean flag = true;

        // Check for double pairs:
        for(int i=0; i<word.length(); i++) {
            int count=0;
            for(int j=0; j<word.length(); j++) {
                if(word.charAt(i)==word.charAt(j)) {count++;}
            }
            if (count != 2) {flag = false; break;}
        }
        return flag;
    }
}
