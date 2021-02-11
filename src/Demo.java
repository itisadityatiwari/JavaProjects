//create a class calc and reference it in demo class
class Calc 
{ 
	int num1;
	int num2;
	int result;
	//create a method inside the class	
	 public void perform()
	 {
		 result=num1+num2;
	 }		
}

//create a main method demo

public class Demo
{
	public static void main(String[] args)
	{
		//create object reference
		Calc obj; //this is the reference
		obj = new Calc(); //created memory
		obj.num1=3;
		obj.num2=5;
		obj.perform();
		
		System.out.println("Addition result: "+obj.result);
		
}

}
