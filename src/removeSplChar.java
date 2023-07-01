
public class removeSplChar 
{
	public static void main(String args[])
	{
		String str = "!A#yu$%^&*sh$is^a(n<>E{ng@in&*eer";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
		
		String str1 = "A y ush  i s an En   gi   n eer";
		
		str1 = str1.replaceAll(" ", "");
		System.out.println(str1);
	}

}
