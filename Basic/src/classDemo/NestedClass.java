package classDemo;

import java.util.HashMap;

public class NestedClass {
	public static void main(String[] args) {
		Outer outer = new Outer("o");
		Outer.Inner inner = outer.new Inner(); // 通过实例来构建内部类
		inner.hello();
		outer.asyncHello();
		// Map初始化
		HashMap<String, String> map = new HashMap<>() {
			{
				put("A", "1");
				put("B", "2");
			}
		};
	}

}

class Outer {
	private String name;
	public static int age = 18;

	Outer(String name) {
		this.name = name;
	}

	class Inner {
		void hello() {
			System.out.println("Hello, " + Outer.this.name); // 通过Outer.this访问父类的实例，通过this访问自己的实例
		}
	}

	static class StaticNested {
		void hello() {
			System.out.println("Hello, " + Outer.age); // 只能访问父类的静态属性
		}
	}

	void asyncHello() {
		// 线程初步
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello, " + Outer.this.name);
			}
		};
		new Thread(r).start();
	}
}
