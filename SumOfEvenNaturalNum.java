package loops;

import java.util.Scanner;

public class SumOfEvenNaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sum of even natural numbers");
		int num=sc.nextInt();
		int start=1,sum=0;
		while(start<=num)//1<=5 2<=5 3<=5 4<=5 5<=5 6<=5
		{
			if(start%2==0)
			{
				System.out.println(start);
			sum=sum+start;//sum=0+1=1 sum=1+2=3 sum=3+3=6 sum=6+4=10 sum=10+5=15
			}
			
			start++;//2,3,4,5,6
		}
		System.out.println(sum);//15

		


	}
}



