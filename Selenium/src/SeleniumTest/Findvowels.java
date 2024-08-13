package SeleniumTest;

public class Findvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Sathyaseelan";
		int vowelscount = 0;
		
		input = input.toLowerCase();
		
		int length = input.length();
		
		for( int i=0;i<length;i++) {
			
			if(input.charAt(i)== 'a'|| input .charAt(i)=='e'|| input.charAt(i)=='i'|| input.charAt(i)=='0'|| input.charAt(i)=='u' );
			
			vowelscount++;
		}
		
		System.out.println("Your name has :" + vowelscount + "vowel(s)");
		}


}
		
		

	


