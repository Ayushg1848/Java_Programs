
public class First 
{
	private int y = 20;
	public static void main(String args[])
	{
		System.out.println();
		First fs = new First();
		System.out.println(fs.y);
		
		Second ss = new Second();
		ss.Getter();
	}
	
	public void Example1()
	{
		
	}
	
}


class Second
{
	private int x;
	
	public void Getter()
	{
		System.out.println("getter");
		x = 80;
		System.out.println(x);
	}
}

