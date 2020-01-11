package _06_minion;

public class Minion {
		private String name; 
		private int eyes; 
		private String color; 
		private String master;
	
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	String getName() {
		System.out.print(name);
		return name;
		
	}
	int getEyes() {
		return eyes;
	}
	String getColor() {
		return color;
	}
	void setMaster(String masters) {
		master = masters;
	}
	void setName(String names) {
		name = names;
	}
	void setEyes(int eye) {
		eyes = eye;
	}
	void setColor(String colors) {
		color = colors;
	}
	String getMaster() {
		return master;
	}
}
