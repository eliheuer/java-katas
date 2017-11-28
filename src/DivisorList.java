import java.util.*;

/** Enter an integer and prints all its divisors. */
public class DivisorList {
    
    public static void main(String[] args) {

	// int input
	int input = 0;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a number: ");
	input = in.nextInt();
	System.out.println("\nInt = "+input);

	// Get divisor list
	getDivisors(input);
    }

    public static void getDivisors(int input) {
	System.out.println("\nGetting divisors of... "+input);
	ArrayList<Integer> divisorList = new ArrayList<Integer>();
	for (int i=1;i <= input; i++) {
	    if (input % i == 0) {
		divisorList.add(i);
	    }    
	}
	System.out.println("\nThe divisors are: "+divisorList);
    }
}
