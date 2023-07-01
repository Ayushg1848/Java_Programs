


class Machine
{
	void running()
	{
		System.out.println("machine is running");
	}
}


class Car extends Machine
{
	void running()
	{
		System.out.println("car is running");
	}
}




public class OverridingDemo 
{
	public static void main(String args[])
	{
		Machine cr = new Machine();
		cr.running();
	}

}
