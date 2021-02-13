class A
{
	int i=0; //Variable becomes constant if you make it final
	//final int j=0;
	final int j;
	public A()
	{
		i=10;
		j=11; // Cannot change the value of final if it is assigned during declaration
	}
}

final class B //If we make the class final we cannot extend it
{
	public void Print()
	{
		System.out.println("In B");
	}
}

class C //If we method final then we cannot override it
{
	public final void Print()
	{
		System.out.println("In C");
	}
}

//class D extends C //If we method final then we cannot override it
//{
//	public void Print()
//	{
//		System.out.println("In D");
//	}
//}

public class FinalKeywordDemo {

	public static void main(String [] args)
	{
		A obj=new A();
		System.out.println(obj.i+":"+obj.j);
		B obj1 = new B();
		//B.Print(); Cannot access method of B because it is final
		//however we can access B.Print by making Print() static
	}
}
