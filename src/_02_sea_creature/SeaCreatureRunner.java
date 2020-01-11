package _02_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.laugh();
		spongebob.eat();
		SeaCreature patrick = new SeaCreature("Patrick");
		patrick.getName();
		patrick.laugh();
		patrick.eat();
		SeaCreature squidward = new SeaCreature("Squidward");
		squidward.getClass();
		squidward.laugh();
		squidward.eat();
		
	}
}
