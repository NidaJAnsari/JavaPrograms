package conditionalstatement;
import java.util.Scanner;
public class StudentGradeCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the id");
        int id=sc.nextInt();
        System.out.println("enter the student Name");
        String name=sc.next();
        System.out.println("enter the 5 marks");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
      int total=m1+m2+m3+m4+m5;
      double percentage=(total*100)/500;
      System.out.println("The Student id=:"+id);
      System.out.println("The Student Name=:"+name);
      System.out.println("The Student total=:"+total);
      System.out.println("The Student percentage=:"+percentage); 
      char grade=' ';
      if(percentage>90)
      {
         grade='A';
      }
      else if(percentage>80 && percentage<90)
      {
          grade='B';
      }
      else if(percentage>70 && percentage<80)
      {
          grade='C';
      }
      else if(percentage>60 && percentage<70)
      {
          grade='D';
      }
      else if(grade<50)
      {
          grade='F';
      }
      else
      {
          System.out.println("no valid marks");
      }
      System.out.println("The Grade is=:"+grade);
    }
}



