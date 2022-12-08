package Arrey;

import java.util.Arrays;

public class Arrey_reverce1D 
{public static void main(String[] args)
{
	int Ary[]= {10,50,30,20};
	Arrays.sort(Ary);
	for(int i=Ary.length-1;i>=0;i--)
		System.out.println(Ary[i]);
	System.out.println("------------------------------------");
	
	// string type example
	String str[]= {"arjun","krishna","sush","pooja"};
	Arrays.sort(str);
	for(int j=str.length-1;j>=0;j--) // use sort and reverce array
	{
		System.out.println(str[j]);
	}

	System.out.println("-----------sort+reverce------end--");	

	
}

}
