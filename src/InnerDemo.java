class Outer
{
	int num1;// Member variable
	
	public void show() //Member method
	{
		System.out.println("Show Method");
	}
	
	class Inner //Member class
	{
		public void display()
		{
			System.out.println("Inner class has been accessed");	
		}	
	}
	
	static class Inner1
	{
		public void show() 
		{
		System.out.println("Static class inner has been accessed");	
		}
	}
}


public class InnerDemo {

	public static void main(String[] args)
	{
	// Accessing inner class
		Outer obj = new Outer();
		//Create obj of outer class first then 
		Outer.Inner obj1= obj.new Inner();
		obj1.display();
		
		
	//Accessing static Inner class 
		Outer.Inner1 object = new Outer.Inner1();
		object.show();
	}

}
