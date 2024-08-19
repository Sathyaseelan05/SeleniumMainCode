package practiseBySathya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Practise1 {
	
	public static void Sbuffer() {
		
		TreeSet<String> map = new TreeSet<String>();
		
		map.add("sathya");
		map.add("sathya");
		map.add("Alpha");
		map.add("beta");
		
		for(String string :map) {
		System.out.println(string);
		
		}
	}
	
	
	public static void reversewords() {
		
		String given = " Have a gratefull day";
		String rev ="";
		String [] time = given.split(" ");
		
		for(int s=time.length-1; s>=0; s--) {
			
			rev = rev+time[s];
		}
		System.out.println(rev);
		
		
		
	}
	
	public static void reversenumber() {
		
		int num = 12345678;
		int rev=0;
		
		while(num!=0) {
			
			rev = rev*10 + num%10;
			num = num/10;
			
		}
		System.out.println(rev);
		
		
		
	}
	
	public void maph() {
		
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		List<String> name = new ArrayList<String>();
		name.add("sathya");
		name.add("seelan");
		
		
		List<String> location = new ArrayList<String>();
		location.add("chennai");
		location.add("vellor");
		
		
		
		map.put("name", name);
		map.put("Location", location);
		
		System.out.println(map);
		
		
		
		
		
		
			
			
	}
		
		
		
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbuffer();
		reversewords();
		reversenumber();
		
		Practise1 practise = new Practise1();
		practise.maph();
		
		String given = "abcdefgh";
		String rev="";
		char ch;
		for(int s=0; s<given.length(); s++) {
			
			ch = given.charAt(s);
			rev = ch+rev;
		}
		System.out.println(rev);
		
		
	}

}
