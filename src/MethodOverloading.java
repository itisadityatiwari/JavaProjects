class Overload
{
	//Here we have same methods with different parameters,
	// It is called method overloading
	public void add(int i)
	{
		System.out.println(i);
	}
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i, int j,int k)
	{
		System.out.println(i+j+k);
	}
	public void add(int i, int j,String s)
	{
		System.out.println(i+j);
		System.out.println(s);
	}
}

public class MethodOverloading {
	
	public static void main(String []args)
	{
		Overload obj = new Overload();
		obj.add(3,4,"Returns String");
	}
}
