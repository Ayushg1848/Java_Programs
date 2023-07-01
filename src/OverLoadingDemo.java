




class ADDITION
{
	static int add(int x,int y)
	{
		int z = x+y;
		return z;
	}
	
	static int add(int x,int y, int z, String str)
	{
		int i = x+y+z;
		System.out.println(str);
		return i;
	} 
}

public class OverLoadingDemo 
{
	public static void main(String args[])
	{
//		ADDITION ad = new ADDITION();
		System.out.println(ADDITION.add(10, 30));
		System.out.println(ADDITION.add(10, 30, 40,"Hello"));
	}

}
