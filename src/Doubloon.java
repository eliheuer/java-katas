import java.util.*;

/** Test a string to see if it is a doubloon. */
public class Doubloon {
    
    public static void main(String[] args) {

	// Test string, edit to test other strings.
	String test = "hannah";
	
	// input
	boolean doubloonTest;
	doubloonTest = isDoubloon(test);
	System.out.println("doubloonTest = "+doubloonTest);

	if () {
	    System.out.println(test+" is a doubloon.");
	} else {
	    System.out.println(test+" is not an doubloon.");
	}
    }
    
    public static boolean isDoubloon (String word) {
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
