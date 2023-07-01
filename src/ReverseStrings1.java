
public class ReverseStrings1 {

	public static void main(String[] args)
	{
		String str = "Ayush is an Engineer";
		
		String arrstr[] = str.split(" ");
		
		
		for(int j = 0 ; j < arrstr.length;j++)
		{
		
		for(int i = arrstr[j].length()-1;i>=0;i--)
		{
			System.out.print(arrstr[j].charAt(i));
		}
		
		System.out.print(" ");
		
		}
		
	    
	}
	

}
