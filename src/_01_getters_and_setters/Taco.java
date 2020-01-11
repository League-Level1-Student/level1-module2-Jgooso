package _01_getters_and_setters;

public class Taco {
private String meat;
private String sauce;
String getMeat(String meat){
	return meat;
}
String getSauce(String sauce) {
	return sauce;
}
void setMeat(String meat){
	meat = meat;
}
void setSauce(String sauce) {
	sauce = sauce;
}

}
class Person{
	private String thesuperpower;
	private String thename;
	String getSuperpower(){
		return thesuperpower;
	}
	String getName() {
		return thename;
	}
	public void setSuperpower(String superpower){
		thesuperpower = superpower;
	}
	public void setName(String name) {
		thename = name;
	}
	public String toString(String name, String power) {
		return(name + " has mad " + power + " skills");
	}
}


