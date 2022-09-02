package conditionalstatement;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		int id;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id:");
	    id = sc.nextInt();
	    {
	    System.out.print("Enter the Name:");
	    name = sc.next();
	    System.out.println("Enter 5 sub marks:=");
	    int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int total=m1+m2+m3+m4+m5;
        float percentage;
        percentage = (total * 100/500);
        System.out.println("The percentage is =" + percentage + "%");
        System.out.println("The Student total=:"+total);
	    System.out.println("The Student Grade is:");
        if(percentage>=90)
        {
            System.out.print("Grade is A");
        }
        else if(percentage>=80 && percentage<70)
        {
           System.out.print("Grade is B");
        } 
        else if(percentage<70 && percentage>60)
        {
           System.out.print("Grade is C");
        } 
        else if(percentage>50 && percentage<60)
        {
        System.out.print("Grade is D");
		}
        else
        {
        	System.out.print("Grade is Fail");
        }
	}

}
}
