/* In java we have multi-level inheritance and single level inheritance
 * We don't have multiple inheritance
 * IS-A and HAS-A relationship
 * AdvCalculator IS-A child, Inheritance Demo HAS-A method of class VeryAdvCalculator
 */

class Calculator
{
	public int Sum(int i, int j)
	{
		return i+j;
	}
}

class AdvCalculator extends Calculator //will have two methods add() from Calculator and sub
{
	public int Sub(int i, int j)
	{
		return i-j;
	}
}

class VeryAdvCalculator extends AdvCalculator //will have 3 methods add(),sub() from AdvCalcualtor and mul
{
	public int Mul(int i, int j)
	{
		return i*j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// Create objects using inheritance
		VeryAdvCalculator obj = new VeryAdvCalculator();
		System.out.println(obj.Sum(4, 3));
		System.out.println(obj.Sub(4, 3));
		System.out.println(obj.Mul(4, 3));
	}

}
