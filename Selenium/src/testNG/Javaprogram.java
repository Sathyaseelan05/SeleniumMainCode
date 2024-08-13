package testNG;

public class Javaprogram {
	
	public static void Sbuffer() {
		
		
		String given = " Have a nice day";
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());
		
		
	}
	
	
	public static void reversewords() {
		
		String given = " India is my country";
		String rev = "";
		String [] time = given.split(" ");
		
		for ( int s = time.length-1; s>=0; s--) {
			
			rev = rev + time[s];
		}
		System.out.println(s);
		
		
		
		
		
		
	}
	
	public static void reversenumber() {
	
		
		int num = 12345678;
		int rev =0;
		
		while (num!=0) {
			
			rev = rev*10 + num%10;
			num = num/10;
			
				
		}
		System.out.println(rev);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbuffer();
		reversewords();
		reversenumber();
		
		String given = " sathya is Inevitable";
		String rev = "";
		char ch;
		for ( int s=0; s<given.length(); s++) {
			
			ch = given.charAt(s);
			rev = rev+ ch;
		}
		
		
		System.out.println(rev);
		
		
	}

}
