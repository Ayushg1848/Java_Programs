
public class ObjectClass 
{
	protected int z = 10;
	
	public static void main(String args[])
	{
		Another an = new Another();
	    an.SecondMethod();
	    ObjectClass ob = new ObjectClass();
	    ob.firstMethod();
	    
	    int[] arr = new int[20];
	   
	    for(int i = 0;i<arr.length;i++)
	    {
	    	arr[i] = i;
	    }
	    
	    for(int i = 0;i<arr.length;i++)
	    System.out.println(arr[i]);
	    
	}
	
	 public void firstMethod()
		{
		 ObjectClass ob2 = new ObjectClass();
		 System.out.println(ob2.z);
		 int x = 10;
		System.out.println("Hello i am in first method "+x);
		}
	
}

class Another
{
	public void SecondMethod()
	{
		ObjectClass ob1 = new ObjectClass();
		System.out.println(ob1.z);
		System.out.println("Hello i am in second method");
	}
}
