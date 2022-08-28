package abstraction;

public class ImplemetClass implements I2
{

	@Override
	public void Info() {
		// TODO Auto-generated method stub
		System.out.println("This is incomplete method");
	}

	@Override
	public void Add() {
		// TODO Auto-generated method stub
		System.out.println("This is Addition method");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("This is Addition method");
	}

	public static void main(String[] args) {
		ImplemetClass obj1=new ImplemetClass();
		obj1.Add();
		obj1.sub();
		obj1.Info();
		I2.m1();
	}
	
}
