


class A
{
	void a()
	{
		System.out.println("a");
	}
}

class B extends A
{
	void b()
	{
		System.out.println("b");
	}
}

class C extends A
{
	void c()
	{
		System.out.println("c");
	}
}

public class multilevelInheritance 
{
	public static void main(String args[])
	{
		C c = new C();
		c.c();
//		c.b();
		c.a();
	}

}


