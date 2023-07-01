import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RemoveSplCharaccters2 {

	public static void main(String[] args) 
	{
		String str = "!A@!#y%u^&&**()sh__+=is%$$a@n)E(n{}g#$%ineer";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(str);
		
		String st = "Automation";
		
		st = st.substring(5);
		
		System.out.println(st);
	}

}
