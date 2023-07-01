package JavaPrograms;

public class MobilePhone
{
	public static void main(String args[])
	{
		MobilePhone mp = new MobilePhone();
		
		mp.calling();
		mp.messaging();
	}
	
	public void calling()
	{
		System.out.println("Calling");
	}
	
	public void messaging()
	{
		System.out.println("messaging");
	}
}