package Arrey;

public class Arry_basic_2 
{ //second or other method to arrey declaration
	public static void main(String[] args) 
	{
		String s[]= {"mane","more","mandlik","shinde"};
		
		System.out.println(s[1]);
		
		for(String j:s)      // USE FOR EACH LOOP

		{System.out.println(j);}
		
	System.out.println("------------end (FOR Each) type loop------------------");
	
		for(int i=0;i<s.length;i++)  // use for loop to same output
			System.out.println(s[i]);
		System.out.println("----------(For loop) END--------------");
		//PROGRAM -2
		int ar[]= {100,200,300,400,500,};
		for(int a=0;a<ar.length;a++) {  // use for loop to same output
			System.out.println(ar[a]);
		}
		System.out.println("--------END int type (FOR loop)------- ");
		// for same out put we use for each loop
		for (int d:ar)
		{
			System.out.println(d);
		}
		System.out.println("--------END (FOR EACH LOOP)-------");
	}

}
