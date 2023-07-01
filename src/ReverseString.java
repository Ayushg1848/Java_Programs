import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[])
	{
		System.out.println("please enter a String");
		
		Scanner sc = new Scanner(System.in);
		
	    String str = sc.nextLine();
	    
	    String strarr[] = str.split(" ");
	    
	    for(int j = 0;j<strarr.length;j++) // What is Automation // tahW si noitamotuA
	    {
	    for(int i = strarr[j].length()-1;i>=0;i--)
	    {
	    	System.out.print(strarr[j].charAt(i));
	    }
	    System.out.print(" ");
	    }
	    
	}

}
