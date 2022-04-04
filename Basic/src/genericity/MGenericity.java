package genericity;

// 泛型只能接收Object，不能接收基本类型，如int
// 泛型类获取到的class一致，都为Object
public class MGenericity {
	public static void main(String[] args) {
		Pair<String, Boolean> p1 = new Pair("123", true);
		PairSB p2 = new PairSB("123", true);

		Pair<Integer, Integer> p3 = new Pair(1, 2);
		int a = add(p3);
	}

	// 注： Pair<Integer> 无法匹配Pair<Number>，如果想要匹配，使用Pair<? extends Number>，
	// Pair可以接收Number的子类，只读
	static int add(Pair<? extends Number, ? extends Number> p) {
		int f = (int) p.first;
		int s = (int) p.second;
		return f + s;
	}

	// Integer父类的Pair【如Number】可以接收Integer类型
	// Pair可以接收Integer的父类，只写
	static void set(Pair<? super Integer, ? super Integer> p, Integer a, Integer b) {
		p.first = a;
		p.second = b;
	}
	// 小结： 读用extends ， 写用super

}

class Pair<T, K> {
	public T first;
	public K second;

	public Pair(T f, K s) {
		first = f;
		second = s;
	}
}

class PairSB extends Pair<String, Boolean> {

	public PairSB(String f, Boolean s) {
		super(f, s);
		// TODO Auto-generated constructor stub
	}
};
