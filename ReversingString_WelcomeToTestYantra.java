package ProgramForTestYantra;

public class ReversingString_WelcomeToTestYantra {

	public static void main(String[] args) {
		
		String s = "Welcome to Test Yantra";
		
		String a[] = s.split(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i] + " ");
		}

	}

}
