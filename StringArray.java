package Arrays;

public class StringArray {

	public static void main(String[] args) {
		String name[]=new String[5];

		name[0]="Owi";
		name[1]="Jammy";
		name[2]="Munawar";
		name[3]="Nih";
		name[4]="Ni";
		for (int i=0; i<5; i++)  
		{  
		System.out.println(name[i]);  
		}  
		for ( String str: name)  
		{  
		System.out.println(str);  
		}  

	}

}
