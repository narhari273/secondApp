package Arrey;

public class Palindrom_Number {

	public static void main(String[] args) {
		String a[]=new String[5];
		a[0]="M";
		a[1]="A";
		a[2]="D";
		a[3]="A";
		a[4]="M";
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		for(String j:a)
		{
			System.out.println(j);
		}
	}
}
