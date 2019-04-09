package Abstract_classes_and_interfaces;

class Pig extends Raptile{
	
	private String name = "Pig";
	
	public String getName() {
		return this.name;
	}
	
	public void move(String destination) {
		System.out.println("Pig move to " + destination + ".");
	}
	
	public void drink() {
		System.out.println("Pig down to drink water .");
	}
	
}

class Sheep extends Raptile{
	
	private String name = "Sheep";
	
	public String getName() {
		return this.name;
	}
	
	public void move(String destination) {
		System.out.println("Sheep move to " + destination + ".");
	}
	
	public void drink() {
		System.out.println("Sheep down to drink water .");
	}
	
}