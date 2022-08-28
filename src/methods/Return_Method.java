package methods;

public class Return_Method 
{

	public int Addition(int a,int b)
	{
		int sum;
		sum=a+b;
		return sum;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Return_Method r1=new Return_Method();
		int a=r1.Addition(12, 18);
		System.out.println(a);
	}
}
