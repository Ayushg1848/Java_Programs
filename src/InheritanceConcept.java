
public class InheritanceConcept 
{
	public static void main(String args[])
	{
		SmallStudent st = new SmallStudent();
		st.address();
		st.babyChild();
		st.rollnumber();
		
	}

}

class child
{
	public void babyChild()
	{
		System.out.println("babyChild");
	}
}

class Student extends child
{
	public void rollnumber()
	{
		System.out.println("rollnumber");
	}
}


class SmallStudent extends Student
{
	public void address()
	{
		System.out.println("address");
	}
}
