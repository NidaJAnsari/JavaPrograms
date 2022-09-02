package loops;

import java.util.Scanner;

public class FactorialForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt()
;		int fact=1;
for(int start=1;start<=number;start++)//1<=3 2<=3 3<=3
{
	fact=fact*start;//fact=1*1=1 fact=1*2=2 fact=2*3=6
}
System.out.println("The fact value is " +fact);//1
   

	}

}
