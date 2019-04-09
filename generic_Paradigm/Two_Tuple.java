package generic_Paradigm;

public class Two_Tuple <A,B>{
	public final A first;
	public final B second;
	public Two_Tuple(A a,B b) {
		first = a;
		second = b;
	}
	public String toString() {
		return "(" + first + " , " + second + ")";
	}
	public static void main(String[] args) {
		Two_Tuple<Character,Character> t = new Two_Tuple<Character,Character>('a','b');
		System.out.println(t.toString());
	}
}
