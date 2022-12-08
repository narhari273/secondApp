package Arrey;

public class multidimensional_2 
{public static void main(String[] args) 
{ 
	int S[][]= {{10,20,30},{50,60,70}};
	for(int a=0;a<2;a++) 
	{
		for(int b=0;b<3;b++) 
		{System.out.print(S[a][b]+" ");
	}
	System.out.println();
	
	
}
	// String case program
		String As[][]= {{"ABC","CDE","ABD"},{"PQR","PRS","PQS"},{"XYZ","XXZ","YZX"}};
		for(int i=0;i<As.length;i++) 
		{		for(int j=0;j<As.length;j++) 
		{
			System.out.print(As[i][j]+"  ");
		}
			
		}
		System.out.println();
}
}
