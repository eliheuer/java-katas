
import java.util.*;

/** Ask user for input, find double chars. */
public class CountDouble {
    
    public static void main(String[] args) {

	// Set types
	String userText = null;

	// User input
	Scanner in = new Scanner(System.in);
	System.out.print("\nEnter some text: ");
	userText = in.nextLine();
	
	// Check for double chars
	checkForDouble(userText);
    }

    public static void checkForDouble(String string) {

	// Debug
	// int stringLength = string.length(); 
	// System.out.println("string.length() = "+stringLength);
	
	// Set double count
	int doubleCount = 0; 
	    
	// Look for double chars
	for (int i=0; i < string.length()-1; i++) {

	    if (i < string.length()) {
		char tempA = string.charAt(i);
		char tempB = string.charAt(i+1);
		if (tempA == tempB) {
		    doubleCount += 1;
		}
	    } else {
		System.out.println("done");
	    }
	}
	// print the count of doubles
	System.out.println("\nDouble count = "+doubleCount);
    }
}

