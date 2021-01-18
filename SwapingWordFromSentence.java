package ProgramForTestYantra;

public class SwapingWordFromSentence {

	public static void main(String[] args) {
		
		String x = "Welcome to Test Yantra";
		
		// getting first word
		int firstWord = x.indexOf(" ");
		
		String first = x.substring(0,firstWord); // Welcome
		
		// getting last word
				int lastWord = x.lastIndexOf(" ")+1;
				
				String last = x.substring(lastWord); // Yantra
				
				// print first and last word
				
				System.out.println("first word is =  "+first );
				System.out.println("last word is =  "+last );
				
				// Program for swaping the words
				String a=first;
				String b=last;
				a = a+b;
				
				
				b = a.substring(0,a.length()-b.length());
				a = a.substring(b.length());
				System.out.println(a); // Yantra
				System.out.println(b);  // Welcome
	}
}
