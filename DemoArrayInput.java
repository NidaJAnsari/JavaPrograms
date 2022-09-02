package Arrays;

import java.util.Scanner;

public class DemoArrayInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();//3
		int arr[]=new int[size];//arr[0],arr[1]arr[2]
		for(int i=0;i<size;i++)//0<3 1<3 2<3 3<3=f
		{
			arr[i]=sc.nextInt();//arr[0]=23 arr[1]=34 arr[2]=45
			
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);//23,34,45


	}

}
}
