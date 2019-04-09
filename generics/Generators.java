package generics;

import java.util.Collection;

import net.mindview.util.Generator;


public interface Generators <T>{
	T next();

	public static <T> Collection<T> fill(
		      Collection<T> coll, Generator<T> gen, int n){
		    for(int i=0; i<n; i++){
		//      coll.add(gen.next());
		    }
		    return coll;
		  }
		}

