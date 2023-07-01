
public class Test 
{

	private void add()
	{
		System.out.println("i am add");
	}
	
	public static void main(String[] args) 
	{
		 
		System.out.println("Welcome to main"); 
		
	
		Animal an = new Animal();
		an.eating();
		an.run();
		Phone ph = new Phone();
		System.out.println(ph.x);
		
		Test ts = new Test();
		ts.add();
		
	
	}
	


}

class Phone
{
	public void calling()
	{
		System.out.println(x);
		System.out.println("Calling");
	}
	
	public void chating()
	{
		System.out.println("chating");
	}
	
	protected int x = 10;
	
	

}


class Animal
{
	public void run()
	{
		System.out.println("running");
	}
	
	public void eating()
	{
		System.out.println("eating");
	}
	
}
