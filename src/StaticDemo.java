class Emp{
	int eid;
	int salary;
	static String Ceo; //static work make the variable store at class level instead of object level
	
	//we can also use static block to initialize the static variable
	
	static
	{
	 Ceo="No One";	
	}
	
	public void show() {
		System.out.println(+eid +":" +salary +":" +Ceo);
	}
}


public class StaticDemo {
	
	//int i=0; // to use this variable inside main method we will have to make it static
	static int i=0;
	public static void main(String[] args) {
		
		System.out.println(i);
		
		Emp Aditya = new Emp();
		Aditya.eid=10;
		Aditya.salary=100000;
		Emp.Ceo="Tiwari"; //we can use class to initialize static variables
		
		Emp Sanchit = new Emp();
		Sanchit.eid=11;
		Sanchit.salary=50000;
		//Sanchit.Ceo="Deshmukh";

		Sanchit.show();
		Aditya.show();
		
		
		//Lets just say the Aditya and sanchit both work at same company 
		//then if ceo changes for Aditya it changes for sanchit too.
		// so to avoid extra work we can make String Ceo (Static String Ceo)
	}

}
