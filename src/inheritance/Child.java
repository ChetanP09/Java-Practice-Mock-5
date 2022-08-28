package inheritance;

public class Child extends Parent
{
	public void Bike() 
	{
		System.out.println("Fz bike");
		
	}
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.Bike();
		c.House();
		c.Car();
	}

}
