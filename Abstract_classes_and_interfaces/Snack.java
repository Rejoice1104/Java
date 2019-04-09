package Abstract_classes_and_interfaces;

public class Snack extends Mammal implements Hunt{
	
	private String name = "Snack";
	
	public String getName() {
		return this.name;
	}
	
	public void move(String destination) {
		System.out.println("Snack move to " + destination + ".");
	}
	
	public void drink() {
		System.out.println("Snack down to drink water .");
	}
	
	public void hunt(Animal animal) {
		System.out.println("Snack catched a " + animal.getName() + " and eat it .");
	}
	
}