package polymorphism;

public class MethodOverriding2 extends MethodOverriding1
{

	public void House() 
	{
		System.out.println("4 bhk house");
		
	}
	public static void main(String[] args) {
		System.out.println("RunTime polymorphism");
		MethodOverriding2 m2 =new MethodOverriding2();
		m2.House();
	}
}
