package abstraction;

public interface I2 extends I1
{

	void sub();		//by default Abstract and public
	static void m1()
	{
		System.out.println("This is static method running in interface");
	}
}
