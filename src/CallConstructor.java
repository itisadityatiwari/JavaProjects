class Constructors
{
	int num1;
	int num2;
	
	//Default Constructor
	public Constructors()
	{
		num1=1;
		num2=1;
		System.out.println("Default Constructor " +num1 +":" +num2);
	}
	
	//parameterized constructor with 1 paramter
	public Constructors(char s)
	{
		num1=(int) s;
		num2= (int) s;
		System.out.println("char Constructor " +num1 +":" +num2);
	}
	
	//Parameterized Constructor
	public Constructors(double a,double b)
	{
		num1=(int) a;
		num2=(int) b;
		System.out.println("Double Constructor " +num1 +":" +num2);
	}
		
}


public class CallConstructor {
	public static void main(String[] args) {
		Constructors obj1 = new Constructors();
		Constructors obj2 = new Constructors(5.5,7.5);
		Constructors obj3 = new Constructors('A');		
	}
	
	
}