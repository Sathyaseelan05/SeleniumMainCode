package stringConcept;

public class StringCon {
	
	//String is IMMutable, we can create values for the variable by using String Literal, String new keyword

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		String s3 = "seelan";
		
		String s1 = new String("sathya");
		String s2 = new String("sathya");
		
		System.out.println(s1==s2);
		
		
		//Eg for saying the String is Immutable
		
		String s5 = new String("Process");
		System.out.println("Appending a value in String - " + s5.concat(" and Progress"));
		System.out.println(s5);

		String trim = "    sathya    ";
		System.out.println(trim.trim());
		System.out.println(trim);
		
		String r = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(r.replace("a","0"));
		
		String join = "05121996";
		System.out.println(join.join("/", "05","12","1996"));
		
		
		
		
	}

}
