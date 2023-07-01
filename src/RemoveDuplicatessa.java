
public class RemoveDuplicatessa 
{
	public static void main(String args[])
	{
		
		String str = "Prgramming";
		
		String str1 = "";
		
		char arr[] = str.toCharArray();
		
		for(int i = 0;i<arr.length;i++)
		{
			if(!String.valueOf(arr[i]).contains("a") && !String.valueOf(arr[i]).contains("e") && !String.valueOf(arr[i]).contains("i") && !String.valueOf(arr[i]).contains("o") && !String.valueOf(arr[i]).contains("u"))
			{
				System.out.print(arr[i]);
			}
		}
		
//		System.out.println(str1);
		
		
	}

}
