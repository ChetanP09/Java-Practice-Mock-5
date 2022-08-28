package polymorphism;

public class MethodOverloading
{

	public void Addition(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void Addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Compile time polymorphism");
		MethodOverloading m1=new MethodOverloading();
		m1.Addition(10,23,44);
		m1.Addition(12,23);
		
	}
	
}
