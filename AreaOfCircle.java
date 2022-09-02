package basics;

import java.util.Scanner;
//area=pi*r*r;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the radius");
	int radius=sc.nextInt();
	
	double area=3.14*radius*radius;
	System.out.println("The Area of circle =:"+area);

	}

}
