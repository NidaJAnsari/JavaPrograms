package loops;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {
		String s;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Large");
		break;
		case 2:System.out.println("medium");
		break;
		case 3:System.out.println("Small");
		break;
		default:System.out.println("no match content available");
		}
		System.out.println("do you want to continue");
		s=sc.next();

		}
		while(s.equals("y"));

	}

}
