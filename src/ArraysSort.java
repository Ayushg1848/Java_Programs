import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysSort 
{
	public static void main(String args[])
	{
		String str = "Ayush";
		
		char arr[] = str.toCharArray();
		
		//Approach 1
		Arrays.sort(arr);
		System.out.println(arr);
		
		
		// Approach 2
		
		char temp;
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(new String(arr));
		
	}

}
