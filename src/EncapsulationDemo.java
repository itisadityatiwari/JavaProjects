/*
 * Encapsulation using getters and setters
 */

class User
{
	//Making these private to limit access directly to variables
	private String uname;
	private int uid;
	
	//Setter method to access private variables
	public void CredChange(String uname, int uid)
	{
		this.uname=uname;
		this.uid=uid;
		//method to change uname and uid
	}
	
	//Getters method to access variables
	public String unameDisplay()
	{
		return uname;
	}
	
	public int uidDisplay()
	{
		return uid;
	}
	
}

public class EncapsulationDemo {
	public static void main(String[] args)
	{
		User obj = new User();
		obj.CredChange("Aditya", 1832);
		System.out.println(obj.uidDisplay());
		System.out.println(obj.unameDisplay());	
	}
}
