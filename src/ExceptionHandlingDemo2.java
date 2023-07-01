
public class ExceptionHandlingDemo2 
{
	public static void main(String args[])
	{
		int y = 10;
		Suresh ss = new Suresh();
		try
		{
		System.out.println(ss.add(10));
		}
		catch (Exception e) 
		{
			System.out.println("Exception handled");
			try
			{
				System.out.println("in try");
				if(y==10)
				{
					throw new ArithmeticException();
				}
				else
				{
					
				}
			
				
				
			}
			catch (Exception e1) 
			{
				System.out.println("again handled");
			}
		}
		
		
	}

}


class Suresh
{
	public int add(int x) throws ArrayIndexOutOfBoundsException
	{
		int arr[] = new int[5];
		arr[x] = 10;
		return arr[x];
	}
}