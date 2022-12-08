package Arrey;

import java.util.Arrays;

public class Arrey_sort_function_use 
{  public static void main(String[] args)
{
	int a[]= {200,300,100,400,600};
	// Array short (for assending order)
	Arrays.sort(a);
	for (int i=0;i<5;i++)System.out.println(a[i]);
	
	System.out.println("------------------end---------");
	String sr[]= {"SITRC","SP","SIP","SIEM"};
	Arrays.sort(sr);
	for(String j:sr) // For each loop
	{
		System.out.println(j);
	}
	System.out.println("-------------------------------");
	for(int k=0;k<4;k++) 
	{System.out.println(sr[k]);}
}


}
