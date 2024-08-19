package ConstructorExample;

public class Animal {
	
	//Eg for  paramterized constructor
	
	String animal_name;
	String animal_type;
	
	Animal(String name, String type){
		
		animal_name=name;
		animal_type=type;
	}
	
	public void sayaboutanimal() {
		
		System.out.println("Animal name  is:"+animal_name +" " + "typeis :"+ animal_type);
		
	}
	
	public void ss() {
		sayaboutanimal();
		
	}
	public static void main(String[] args) {
		
		Animal animal1 = new Animal("sathya", "vegan");
		animal1.sayaboutanimal();
		
		Animal animal2 = new Animal("swetha", "veg");
		animal2.sayaboutanimal();
		
		
	}
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	