package Arrey;

public class multi_dimentional_Ary 
{public static void main(String[] args) 
{// String case program
	String As[][]= {{"ABC","CDE","ABD"},{"PQR","PRS","PQS"},{"XYZ","XXZ","YZX"}};
	for(int i=0;i<As.length;i++) 
	{		for(int j=0;j<As.length;j++) 
	{
		System.out.print(As[i][j]+"  ");
	}
		System.out.println();
	}
	System.out.println("-----------------------------------------");
	String Ar[][]= {{"AB","CD","AB"},{"PQ","PR","RQ"},{"XY","XZ","YZ"}};
	for(int k=0;k<As.length;k++) 
	{ 
		for(int m=0;m<As.length;m++) 
		{
			System.out.print(Ar[k][m]+"    ");
		}
		System.out.println();
	}
	System.out.println("----------------------------------------------");
}

}
