package Abstract_classes_and_interfaces;

public class Farmer_Work {
	public static void main(String [] args) {
		
		Pig pig = new Pig();
		Forg forg = new Forg();
		Tiger tiger = new Tiger();
		Snack snack = new Snack();
		Sheep sheep = new Sheep();
		Mouse mouse = new Mouse();
		Rabbit rabbit = new Rabbit();
		Farmer farmer = new Farmer();
		
		farmer.feedWater(tiger, "room");
		farmer.feedWater(snack, "grassland");
		farmer.feedWater(rabbit, "kichen");
		
		farmer.feedAnimal(tiger, pig);
		farmer.feedAnimal(tiger, sheep);
		farmer.feedAnimal(snack, forg);
		farmer.feedAnimal(snack, mouse);
		
	}
	
}
