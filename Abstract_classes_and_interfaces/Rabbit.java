package Abstract_classes_and_interfaces;

public class Rabbit extends Raptile{
	
	private String name = "Rabbit";
	
	public String getName() {
		return this.name;
	}
	
	public void move(String destination) {
		System.out.println("Rabbit move to " + destination + ".");
	}
	
	public void drink() {
		System.out.println("Rabbit down to drink water .");
	}
	
}