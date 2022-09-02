package conditionalstatement;
import java.util.Scanner;
public class CheckPosOrNeg {

	public static void main(String[] args) {
	int number;
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter a number: ");  
	number = sc.nextInt();  
	if(number>=0)  
	{  
	System.out.println("The number is positive.");  
	}  
	else if(number<0)  
	{  
	System.out.println("The number is negative.");  
	}  
	}

}
