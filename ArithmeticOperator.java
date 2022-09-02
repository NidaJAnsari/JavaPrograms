package basics;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the Second number");
		int num2=sc.nextInt();
		int sum=num1+num2;
		int differnce=num1-num2;
		int product=num1*num2;
		int division=num1/num2;
		int result=num1%num2;
		System.out.println("The Addtion is=:"+sum);
		System.out.println("The Subtraction is=:"+differnce);
		System.out.println("The  multiplication is=:"+product);
		System.out.println("The Division  is=:"+division);
		System.out.println("The Modulo  is=:"+result);
		

	}

}
