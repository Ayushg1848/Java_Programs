
public class PrimeNumber 
{
	public static void main(String args[])
	{
		int x = 14;
		String flag = "";
		
		for(int i = 2;i<x;i++)
		{
			if(x%i==0)
			{
				flag = "false";
				break;
			}
			else
			{
				flag = "true";
				break;
			}
		}
		
		if(flag.equals("true"))
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
		
	}

}
