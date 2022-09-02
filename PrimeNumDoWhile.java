package loops;

import java.util.Scanner;

public class PrimeNumDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();//5
		int start=1,fact=0;
		do
		{
			if(num%start==0)//5%1==0 5%2==0=f 5%3==0=f 5%4==0f
				//5%5==0
			{
				fact++;//2
			}
			start++;//2,3,4,5,6
		}
		while(start<=num);//1<=5 2<=5 3<=5 4<=5 5<=5 6<=5

		if(fact==2)//fact==2
		{
			System.out.println("prime number ");
		}
		else
		{
			System.out.println("composite number");
		}


		
	}

}

