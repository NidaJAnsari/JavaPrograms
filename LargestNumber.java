package basics;

public class LargestNumber{

	public static void main(String[] args) {
int a,b,c;
a=30;
b=52;
c=90;
int LargestNumber=(a>b)?(a>c?a:c):(b>c?b:c);
System.out.println("The largest numbers is:  "+LargestNumber);

	}

}
