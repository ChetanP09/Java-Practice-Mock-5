package arrays;

import java.util.Arrays;

public class StringArray
{
	public static void main(String[] args) 
	{
		String s1[]= {"Suyog","Chetan","Veeraj","Boss"};
		System.out.println("Complete array");
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println("\nComplete array in Assending order");
		Arrays.sort(s1);
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println("\nComplete array in Desending order");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.println(s1[i]);
		}
		
	}

}
