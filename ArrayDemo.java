package Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		//datatype variablename size=new datatype[size]
				int a[]=new int[5];
				a[0]=12;
				a[1]=13;
				a[2]=14;
				a[3]=15;
				a[4]=16;
				System.out.println(a[0]);
				System.out.println(a[1]);
				System.out.println(a[2]);
				System.out.println(a[3]);
				System.out.println(a[4]);
				for(int i=0;i<5;i++)//1=0 <5  1<5 2<5
				{
					System.out.println(a[i]);//a[0]=12  a[1]=13
				}
				for(int temp:a)
				{
					System.out.println(temp);
				}




	}

}
