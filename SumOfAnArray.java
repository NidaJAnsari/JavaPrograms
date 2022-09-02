package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAnArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
System.out.println("Enter the size::");
int number=sc.nextInt();
int b[] = new int [number] ;
int sum = 0;  
System.out.println("Enter the elements of the array::");
for (int i = 0; i < number; i++) {  
	b[i]=sc.nextInt();
   sum = sum + b[i];  
}  
System.out.println("Elements of the array are:"+Arrays.toString(b));
System.out.println("Sum of an array: " + sum);
	}

}
