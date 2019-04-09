package Abstract_classes_and_interfaces;

abstract class Animal{
	
	public abstract void move(String destination);
	public abstract void drink();
	public abstract String getName();
	
}

abstract class Mammal extends Animal{
	
}

abstract class Raptile extends Animal{
	
}

interface Hunt{
	
	public void hunt(Animal animal);
	
}
