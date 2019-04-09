package generics;

import java.util.*;

class Fruit{}
class Apple extends Fruit{}

public class NonCovariantGenerics {
	public static void main(String[] args) {
		List<? extends Fruit> fl = new ArrayList<Apple>();
		List<? extends Fruit> f2 = new ArrayList<Fruit>();
		fl.add(null);
		f2.iterator();
	}
}
