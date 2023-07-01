
public class StringReverse {

	public static void main(String[] args) 
	{

		String str = "Ayush is an Engineer";
		
        String arr[] = str.split(" ");
        
        for(int j = 0;j<arr.length;j++)
        {
        for(int i = arr[j].length()-1;i>=0;i--)
        {
        	System.out.print(arr[j].charAt(i));
        }
        System.out.print(" ");
        }
	
	}

}
