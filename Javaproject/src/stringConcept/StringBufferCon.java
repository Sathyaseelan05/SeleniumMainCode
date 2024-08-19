package stringConcept;

public class StringBufferCon {
	
	//StringBuffer is Mutable, we can append the assigned value of the string , we have reverse function is StringBuffer

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringBuffer s1= "sathya";
		
		StringBuffer s1 = new StringBuffer("sathya");
		StringBuffer s2 = new StringBuffer("sathya");
		
		System.out.println(s1!=s2);
		
		//eg for StringBuffer is Mutable
		StringBuffer s5 = new StringBuffer("Iam");
		
		System.out.println("Appending a Value - " + s5.append("Inevictable"));
		
		System.out.println(s5);

	}

}
