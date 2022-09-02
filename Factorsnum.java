package loops;

import java.util.Scanner;

public class Factorsnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();//4
		int start=1;
		do
		{
			if(num%start==0)//4%1==0 4%2==0 4%3==0=false 4%4==0
			{
			System.out.println(start);//1,2,4
			}
			start++;//2,3,4,5
		}
		while(start<=num);//1<=4 2<=4 3<=4 4<=4 5<=4=false

		}

	}

	

        
        
	
		


