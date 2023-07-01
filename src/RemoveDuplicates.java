
public class RemoveDuplicates 
{
	public static void main(String args[])
	{
		String str = "ababababababababababababab";
		
		
		// Approach 1
		
		String str1 = "";
		
		
		
		char[] arr = str.toCharArray();
		
		for(int i = 0 ; i < arr.length; i++)
		{
			String st = String.valueOf(arr[i]);
			
			if(str1.contains(st))
			{

			}
			else
			{
				str1 = str1+st;
			}
		}
		
		System.out.println(str1+ " -- by Approach 1");
		
	}

}
