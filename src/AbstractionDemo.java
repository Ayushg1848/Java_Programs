

abstract class BOI
{
	abstract void Transaction();
	abstract void login();
}

class Paresh extends BOI
{
	void Transaction()
	{
		System.out.println("Student A scores 80%");
		int x = 10;
		int y = 20;
		int z = x+y;
		System.out.println(z);
	}
	
	void login()
	{
		System.out.println("Student A scores 80%");
		int x = 10;
		int y = 20;
		int z = x+y;
		System.out.println(z);
	}
	
	
	
}

class gaurav extends BOI
{
	void login()
	{
		System.out.println("Student B scores 60%");
	}
	
	void Transaction()
	{
		System.out.println("Student B scores 60%");
	}
	
}

public class AbstractionDemo 
{
	public static void main(String args[])
	{
		BOI e2 = new gaurav();
		e2.login();
		
		BOI e3 = new Paresh();
		e3.login();

	}
}
