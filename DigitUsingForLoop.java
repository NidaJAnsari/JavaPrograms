package loops;

import java.util.Scanner;

public class DigitUsingForLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();//1234
		int digit=0;
		while(num!=0)//1234!=0 123!=0 12!=0 1!=0 0!=0
		{
			digit=num%10;//1234%10=4   123%10=3  12%10=2   1%10=1
			System.out.println(digit);//4 3 2,1
			num=num/10;//1234/10=123 123/10=12  12/10=1  
		}
		//4 3 2 1


	}

}
