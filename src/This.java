
class Valc
{
	int num1; //Instance variables
	int num2;
	
	public Valc(int num1, int num2) // Local variables
	{
		this.num1=num1; //if we don't use this here, it will be considered as local scope
		this.num2=num2;// therefore, we use this keyword
	}
}

public class This {
	public static void main(String[] args)
	{
		Valc obj = new Valc(4,4);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}
}
