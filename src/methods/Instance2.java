package methods;

public class Instance2 
{
	public void m1(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		Instance1 i1=new Instance1();
		i1.ShowInfo("This is non static method running");
		Instance2 i2=new Instance2();
		i2.m1(1000);
		
	}
	
}
