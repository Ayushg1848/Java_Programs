import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Switchprogram 
{
	int x = 10;
	int y = 20;
	
	final int age = 78;
	
	public static void main(String args[])
	{
		Seconds s = new Seconds();
		s.add();
		
		Switchprogram sp = new Switchprogram();
		sp.addded();
	}
	
	public void addded()
	{
		System.out.println(" Inside added method");
		System.out.println(this.x); 
	}
	
}


class Seconds extends Switchprogram
{
	int x = 40;
	int y = 80;
	
	
	public void add()
	{
		System.out.println(" Inside add method");
		System.out.println(super.x);
		System.out.println(this.x);
		Switchprogram sp1 = new Switchprogram();
		System.out.println("Age of super class is :- "+this.age);
	}
	
}

