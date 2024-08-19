package Polymorphisn;

public class Child extends Parent {
	
	
	
	
	
	
	public void sample() {
		System.out.println("dont Print");
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Parent parent = new Child();
		parent.sample();
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
