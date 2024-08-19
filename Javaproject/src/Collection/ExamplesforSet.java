package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class ExamplesforSet {
	
	//Duplicate values are not allowed, Insertion order will not be followed.
	public static void HashSetCon() {
		
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("sathya");
		hashset.add("sathya");
		hashset.add("bala");
		hashset.add("seelan");
		
		System.out.println("Hashset print :" + hashset.size());
		for (String string : hashset) {
		System.out.println("hashset is :" + string);
			
		}
		
	}
	//Duplicate values are not allowed, Insertion order will  be followed.
	public static void LinkedHashSet() {
		java.util.LinkedHashSet<String> linkhashset= new java.util.LinkedHashSet<String>();
		
		linkhashset.add("BMW");
		linkhashset.add("BENZ");
		linkhashset.add("BMW");
		linkhashset.add("MINI");
		linkhashset.add("I20");
		
		System.out.println(linkhashset);
		
		for (String string : linkhashset) {
			System.out.println("LinkedHasSet is:" + string);
		}
		
		
		
	}
	//Duplicate values are not allowed, Insertion order will  be followed in natural sorting order(ASC).
	public static void TreeSet() {
		
		java.util.TreeSet<String> treeset = new java.util.TreeSet<String>();
		
		treeset.add("Sandhiya");
		treeset.add("Aravind");
		treeset.add("Bala");
		treeset.add("Bala");
		treeset.add("Caesar");
		System.out.println("treeset print -" + treeset);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetCon();
		LinkedHashSet();
		TreeSet();

	}

}
