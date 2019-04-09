package generics;

import java.lang.reflect.*;;

class Mine {
	public void walkAgainstTheWind() {}
	
	public void sit() {
		System.out.println("Pretending to sit");
	}
	
	public void pushInvisibleWalls() {}
	
	public String toString() {
		return "Mine";
	}
}

class SmartDog{
	public void speak() {
		System.out.println("Woof!");
	}
	
	public void sit() {
		System.out.println("Sitting");
	}
	
	public void reproduce() {}
}

class Robot{
	public void speak() {
		System.out.println("Click!");
	}
	
	public void sit() {
		System.out.println("Clank");
	}
	
	public void reproduce() {}
}

class CommunicateReflectively{
	public static void perform(Object speaker) {
		Class<?> spkr = speaker.getClass();
		try {
			Method speak = spkr.getMethod("speak");
			speak.invoke(speaker);
		}catch(NoSuchMethodException e) {
			System.out.println(speaker + " cannot speak");
		}
		try {
			Method sit = spkr.getMethod("sit");
			sit.invoke(speaker , null);
		}catch(NoSuchMethodException e) {
			System.out.println(speaker + " cannot sit");
		}catch(Exception e) {
			throw new RuntimeException(speaker.toString() , e);
		}
	}
}

public class LantentReflection {
	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Robot());
		CommunicateReflectively.perform(new Mine());
	}
}
