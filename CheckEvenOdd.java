package conditionalstatement;
import java.util.Scanner;
public class CheckEvenOdd {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter an Integer number:");
		Scanner sc = new Scanner(System.in);
	    number = sc.nextInt();
	    if ( number % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	}

}
