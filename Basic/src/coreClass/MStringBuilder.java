package coreClass;

public class MStringBuilder {
	public static void main(String[] args) {
		// String总是生成一个新字符串
		// StringBuilder则是直接操作内存中的源对象

		var sb = new StringBuilder(1024);
		sb.append("Mr ").append("Bob").append("!").insert(0, "Hello, ");
		System.out.println(sb.toString());

		Adder adder = new Adder();
		adder.add(3).add(5);
	}
}

// 链式操作类
class Adder {
	private int sum = 0;

	public Adder add(int n) {
		sum += n;
		return this;
	}

}
