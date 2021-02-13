class Printer
{
	public void Prints(Number i)
	{
		System.out.println(i);
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj = new Printer();
		obj.Prints(5.001);
	}
}

abstract class Human
{
	public abstract void eat();
}

class Man extends Human
{
	public void eat()
	{
		System.out.println("Man eats");
	}
}