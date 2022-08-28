package arrays;

import java.util.Arrays;

public class SingleArray
{
	public static void main(String[] args)
	{
		int a1[]=new int[5];
		a1[0]=10;
		a1[1]=40;
		a1[2]=30;
		a1[3]=20;
		a1[4]=50;
		System.out.println("Size of arrays  "+a1.length);
		//System.out.println(a1[3]);
		System.out.println("Complete arrays");
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println("Arras in asending order");
	    Arrays.sort(a1);
	    
	    for(int i=0;i<=a1.length-1;i++)
	    {
	    	System.out.println(a1[i]);
	    }
	    
	    System.out.println("Arras in Desending order");
	    
	    for(int i=a1.length-1;i>=0;i--)
	    {
	    	System.out.println(a1[i]);
	    }
	    
		
	}

}
