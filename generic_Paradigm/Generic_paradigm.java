package generic_Paradigm;

class Automobile {}

class Holder1{
	private Automobile a;
	public Holder1(Automobile a) {
		this.a = a;
	}
	Automobile get() {
		return a;
	}
}
//上面的可重用性不好，不能持有其他类型的类，遇到别的类型得重写很麻烦
class Holder2{
	private Object a;
	public Holder2(Object a) {
		this.a = a;
	}
	public void set (Object a) {
		this.a = a;
	}
	public Object get() {
		return a;
	}
}
//指定了Object，可以存储所有符合Object类型的数据，但毕竟还是指定了，也许不太舒服
class Holder3<T>{
	private T a;
	public Holder3(T a) {
		this.a = a;
	}
	public void set(T a) {
		this.a = a;
	}
	public T get() {
		return a;
	}
}
//T是类型参数，暂时不指定类型，用的时候再用实际类型替换，但是一旦指定类型，就不能更换别的类型
public class Generic_paradigm {
	public static void main(String[] args) {
		
	}
}
