package conditionalstatement;
import java.util.Scanner;
public class SwitchAlphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the Alphabets");
		 char alphabet=sc.next().charAt(0);
        switch(alphabet)
        {
        case 'A','a':System.out.println("Android");
        break;
        case 'B','b':System.out.println("Bug");
        break;
        case 'C','c':System.out.println("Computer");
        break;
        case 'D','d':System.out.println("DVD");
        break;
        case 'E','e':System.out.println("Engine");
        break;
        case 'F','f':System.out.println("FloppyDisk");
        break;
        case 'G','g':System.out.println("Github");
        break;
        case 'H','h':System.out.println("Hardware");
        break;
        case 'I','i':System.out.println("Internet");
        break;
        default:System.out.println("no match record available");

	}

}
}
