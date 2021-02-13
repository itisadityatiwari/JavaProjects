
public class WrapperDemo {

	public static void main(String[] args) {
		int i=5; //Primitive way
		int j=6;
		Integer x = new Integer(i);//Wrapper class Boxing/Wrapping
		System.out.println(x);
		Integer y=j; //Autoboxing/AutoWrapping
		System.out.println(y);
		
		//Similarly we have for Float,Double, etc
		String a="123";
		int n = Integer.parseInt(a); //Unboxing/Unwrapping
		System.out.println(n); 
	}

}
