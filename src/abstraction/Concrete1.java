package abstraction;

public class Concrete1 extends Abstract1
{
	public void ShowInfo()
	{
		System.out.println("This is incomple method of abstract class commpleted in concrete class ");
		
	}

	public static void main(String[] args) {
		Concrete1 c1=new Concrete1();
		c1.ShowInfo();
		c1.M1();
		
	}
	
}
