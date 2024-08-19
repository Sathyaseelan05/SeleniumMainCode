package ConstructorExample;

public class NoArgumentsConstructor {
	
	//NoArgConstructor or Non parameterized Constructor
	
	String name;
	int rollno;
	
	public NoArgumentsConstructor() {
		
		name = "sathya";
		rollno = 12;
		System.out.println("Basic Example");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgumentsConstructor Noarg = new NoArgumentsConstructor();
		System.out.println(Noarg.name);
		System.out.println(Noarg.rollno);

	}

}
