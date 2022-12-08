package Arrey;

public class Arrey_badsic1 
{ // basic program - 1
	public static void main(String[] args) 
	{ //Areey declearation
		String sr []=new String[4];
		sr[0]="Mane";
		sr[1]="Mandlik";
		sr[2]="patil";
		sr[3]="more";
		System.out.println(sr[1]);
		System.out.println(sr[0]);
		for(int i=0;i<sr.length;i++)
		{
			System.out.println(sr[i]);
		}
		System.out.println("---------------Program END-------------");
			// PROGRAM - 2
		int mr[]=new int[5];
		mr[0]=10;
		mr[1]=20;
		mr[2]=30;
		mr[3]=50;
		mr[4]=40;
		// use for loop
		for(int i=0;i<5;i++)  // out put with for loop
		System.out.println(mr[i]);
	System.out.println("-------------END---------------------");
	//  USE FOR EACH LOOP
		for(int j:mr) {          // SAME out put with for each loop
			System.out.println(j);
			}
		System.out.println("------------------------------");
	}

}
