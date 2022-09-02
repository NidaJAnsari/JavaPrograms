package conditionalstatement;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter the month");
	        int month=sc.nextInt();//3
	        switch(month)
	        {
	        case 1:System.out.println("Jan");
	        break;
	        case 2:System.out.println("Feb");
	        break;
	        case 3:System.out.println("March");
	        break;
	        case 4:System.out.println("Apr");
	        break;
	        case 5:System.out.println("May");
	        break;
	        case 6:System.out.println("June");
	        break;
	        case 7:System.out.println("July");
	        break;
	        case 8:System.out.println("Aug");
	        break;
	        case 9:System.out.println("Sep");
	        break;
	        default:System.out.println("no match record available");

	}

}
}
