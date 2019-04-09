package Abstract_classes_and_interfaces;

public class Tiger extends Mammal implements Hunt{
	
	private String name = "Tiger";
	
	public String getName() {
		return this.name;
	}
	
	public void move(String destination) {
		System.out.println("Tiger move to " + destination + ".");
	}
	
	public void drink() {
		System.out.println("Tiger down to drink water .");
	}
	
	public void hunt(Animal animal) {
		System.out.println("Tiger catched a " + animal.getName() + " and eat it .");
	}
	
}