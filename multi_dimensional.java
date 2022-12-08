package Arrey;

public class multi_dimensional 
{public static void main(String[] args) 
{int AM[][]=new int[3][3];
AM[0][0]=10;
AM[0][1]=20;
AM[0][2]=30;
AM[1][0]=40;
AM[1][1]=50;
AM[1][2]=60;
AM[2][0]=70;
AM[2][1]=80;
AM[2][2]=90;
for(int i=0;i<3;i++) 
{ for (int j=0;j<3;j++) 
{
	System.out.print(AM[i][j]+" ");

}
	System.out.println();
}
}

}
