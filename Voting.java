package conditionalstatement;
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		
		// Declaring variables
        int x,y;
        // taking values from user at run time
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		x = scan.nextInt();
		// Checking condition for voting..
		if(x>=18)
		{
			System.out.println("Welcome to voting system You can Vote");
		}
		else
		{
		
			System.out.println("Sorry,You can't vote");
	}

}
}
