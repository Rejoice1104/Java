package Abstract_classes_and_interfaces;

class Forg extends Raptile{
	
	private String name = "Forg";
	
	public String getName() {
		return this.name;
	}
	
	public void move(String destination) {
		System.out.println("Forg move to " + destination + ".");
	}
	
	public void drink() {
		System.out.println("Forg down to drink water .");
	}
	
}

class Mouse extends Raptile{
	
	private String name = "Mouse";
	
	public String getName() {
		return this.name;
	}
	
	public void move(String destination) {
		System.out.println("Mouse move to " + destination + ".");
	}
	
	public void drink() {
		System.out.println("Mouse down to drink water .");
	}
	
}