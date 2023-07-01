
public class ThisSuperUse 
{
	int x = 10;
	int y = 20;
	
	int i = 20;
	int j = 40;
	
	final static int age = 78;
	
	public static void main(String args[])
	{
		
		ABC a = new ABC();
		ThisSuperUse th = new ThisSuperUse();
		th.abc();
		a.ab();
		System.out.println(age);
		
	}
	
	public void abc()
	{
		
		System.out.println("abc");
		
		this.x = 100;
		this.y = 200;
		
		System.out.println("abc" +x+" "+y);
	}

}


class ABC extends ThisSuperUse
{
	int i = 40;
	int j = 80;
	
	public void ab()
	{
		System.out.println("ab");
		System.out.println(super.i);
		System.out.println(this.j);
	}
}
