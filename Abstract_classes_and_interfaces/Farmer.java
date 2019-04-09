package Abstract_classes_and_interfaces;

public class Farmer {
	
	public void bringWater(String destination) {
		System.out.println("Farmer bring water to " + destination + ".");
	}
	
	public void bringAnimal(Animal a,String destination) {
		System.out.println("Farmer bring " + a.getName() + " to " + destination + ".");
	}
	
	public void feedWater(Animal animal, String destination) {
		
		this.bringWater(destination);
		animal.move(destination);
		animal.drink();
		
	}
	
	public void feedAnimal(Hunt hunter, Animal animal) {
		
		this.bringAnimal(animal,"Feeding Room");
		Animal ht = (Animal)hunter;
		
		ht.move("Feeding Room");
		hunter.hunt(animal);
		
	}

}
