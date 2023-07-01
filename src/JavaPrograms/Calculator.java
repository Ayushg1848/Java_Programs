package JavaPrograms;

public class Calculator 
{
	public static void main(String args[])
	{
		Calculator cl = new Calculator();
		cl.add(10,20);
		cl.subtraction(50,60);
	}
	
	public void add(int x, int y)
	{
		int z = x + y;
		System.out.println("Addition of "+x+" and "+y+" is = "+z); // Addition of 10 and 20 is = 30
	}
	
	public void subtraction(int x,int y)
	{
		int z = x - y;
		System.out.println("Subtraction of "+x+" and "+y+" is = "+z); // Addition of 10 and 20 is = 30
	}

}
