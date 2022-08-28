package methods;

public class Static2 
{
	public static void m2(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args)
	{
		Static1.M1();	//Static method calling from Different class
		m2("This is static method in same class");	//Static method calling from Same class
	}

}
