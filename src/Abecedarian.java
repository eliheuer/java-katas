import java.util.*;

/** Enter an integer and prints all its divisors. */
public class Abecedarian {
    
    public static void main(String[] args) {
	String test = "dehort";
	
	// input
	boolean abTest;
	abTest = isAbecedarian(test);
	System.out.println("abTest = "+abTest);

	if (abTest) {
	    System.out.println(test+" is an abecedarian.");
	} else {
	    System.out.println(test+" is not an abecedarian.");
	}
    }
    
    public static boolean isAbecedarian (String word) {
	int length = word.length();
	if (length <= 1) {
	    return true;
	}
	char previous;
	char current;
	
	System.out.println("length: "+length);
	
	for (int i = 1; i < length; ++i) {
	    previous = word.charAt(i - 1);
	    current = word.charAt(i);
	    System.out.println(previous);
	    if (previous > current) {
		return false;
	    }
	}
    return true;
    }
}
