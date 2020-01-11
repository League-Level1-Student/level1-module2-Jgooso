package _01_getters_and_setters;

public class PersonRunner {
	static Person john = new Person();
	static Person steve = new Person();
	static Person jim = new Person();
	public static void main(String[] args) {
		steve.setName("Steve");
		john.setName("John");
		jim.setName("Jim");
		john.setSuperpower("Invisible");
		jim.setSuperpower("Night hearing");
		steve.setSuperpower("Strong");
		System.out.println(steve.toString(steve.getName(), steve.getSuperpower()));
		System.out.println(john.toString(john.getName(), john.getSuperpower()));
		System.out.println(jim.toString(jim.getName(), jim.getSuperpower()));
		
	}
	
}
