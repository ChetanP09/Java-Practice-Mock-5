package upcasting;

public class Child extends Parent
{
	public void Bike() 
	{
		System.out.println("Children have fz bike");
		
	}
	public void Home()
	{
		System.out.println("Child make changes in house");
		
	}
	public void Car()
	{
		System.out.println("Child make Updation in  Xuv Car");
		
	}
	public static void main(String[] args) 
	{
//		Child c1=new Child();
//		c1.Car();
		Parent p1=new Child();
		p1.Car();
		
	}
	

}
