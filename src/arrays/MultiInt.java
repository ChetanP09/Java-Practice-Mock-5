package arrays;

public class MultiInt
{
	public static void main(String[] args) 
	{
		int a1[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
