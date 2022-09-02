package conditionalstatement;
import java.util.Scanner;
public class FiveDigit {

	public static void main(String[] args) {
	
		int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        a=sc.nextInt();
        if (a>=10000)
        {
        System.out.println("The Number is Five Digit Number");	
        }
        else
            System.out.println("Not a Five digit number");
	}

}
