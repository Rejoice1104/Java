package generics;

import java.util.*;;

public class CoffeeGenerator implements Generators<Coffee>, Iterable<Coffee>{
	@SuppressWarnings("rawtypes")
	private Class[] types = {
			Latte.class, Breve.class,Cappuccino.class,Americano.class,Mohca.class,
	};
	private static Random rand = new Random(47);
	public CoffeeGenerator() {}
	@SuppressWarnings("unused")
	private int size = 0;
	public CoffeeGenerator(int sz) {
		size = sz;
	}
	@SuppressWarnings("deprecation")
	public Coffee next() {
		try {
			return (Coffee)
					types[rand.nextInt(types.length)].newInstance();
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	@Override
	public java.util.Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}

class CoffeeIterator implements Iterator<Coffee>{
	int count = 5;
	public boolean hanNext() {
		return count > 0;
	}
	public void remoce() {
		throw new UnsupportedOperationException();
	};
	public Iterator<Coffee> iterator(){
		return new CoffeeIterator();
	}
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i=0;i<5;i++) {
			System.out.println(gen.next());
		}
		for(Coffee c : new CoffeeGenerator(5)) {
			System.out.println(c);
		}
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Coffee next() {
		// TODO Auto-generated method stub
		return null;
	}
}
