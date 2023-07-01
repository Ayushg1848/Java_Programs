import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling 
{
	public static void main(String args[])
	{
		int x,y;
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter amount that you want to withdraw----\n limit is 500 to 20000  \n");
		
		
		try
		{
		   
		   x = sc.nextInt();
			
		   if(x>=500 && x<=20000)
		   {
			   System.out.println("Successfully withdrawn-----");
			   flag = true;
		   }
		   else
		   {
			   System.out.println("out of range");
		   }
		}
		catch (Exception e)
		{
			System.out.println("Invalid input----------");
			try
			{
				System.out.println("Trying second time for transaction   \n");
				y = sc1.nextInt();
				
				   if(y>=500 && y<=20000)
				   {
					   System.out.println("Successfully withdrawn-----");
					   flag = true;
				   }
				   else
				   {
					   System.out.println("out of range second time");
				   }
				
			}
			catch (Exception e1) 
			{
				System.out.println("Invalid input----------second time");
			}
		}
		
		finally
		{
			if(flag==true)
			{
			System.out.println("Transaction successfull--------");
			}
			else
			{
			System.out.println("Transaction declined--------");
			}
		}
		
	}

}


