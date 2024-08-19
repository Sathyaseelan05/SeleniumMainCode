package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

//List is a child of Collection(I) interface.
//I will allow Duplicate Values and follows insertion order.
//We can insert Heterogeneous values.(Means without generic we can use but creating generic is a best practise)
//Not Synchronized, so there is no thread safety.
//Except Treeset and Treemap, all other collections can be stored in Heterogeneous Objects.
                                           //(Means without generic we can use but creating generic is a best practise)

// ArrayList and LinkedList both will do the same operations, But in Arraylist helpful for search operation and Linked list is helpful for insertion and deletion.



public class ListConcept{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> heroes = new ArrayList<String>();
		
		heroes.add("Batman");
		heroes.add("Ironman");
		heroes.add("Ironman");
		heroes.add("Thor");
		heroes.add("X-man");
		heroes.get(0);
		
		
		heroes.set(0, "Bat-man");
		System.out.println(heroes);
		System.out.println("-----------------------------------" );
		
		//using for each
		for(String string:heroes) {
			System.out.println("Using for each -" +string);
		}
		System.out.println("-----------------------");
		
		//using for loop
		for(int s =0; s<heroes.size(); s++) {
			System.out.println("Using for loop -" +heroes.get(s)); 
			
		}
		
		//Iterator Interface
		ListIterator<String> listiterator = heroes.listIterator();
		while(listiterator.hasNext()) {
			System.out.println("Using ListIterator-" + listiterator.next()); 
		}
		
		List<String> El = new ArrayList<String>();
		El.add("sathya");
		El.add("arun");
		El.add("rani");
		El.add("tama");
		System.out.println("Sample check :" + El);
		Collections.sort(El);
		System.out.println("Sample check after collections:" + El);
		
		

	}

}
