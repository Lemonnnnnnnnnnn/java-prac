package classDemo;

import java.util.HashMap;

public class NestedClass {
	public static void main(String[] args) {
		Outer outer = new Outer("o");
		Outer.Inner inner = outer.new Inner(); // ͨ��ʵ���������ڲ���
		inner.hello();
		outer.asyncHello();
		// Map��ʼ��
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
			System.out.println("Hello, " + Outer.this.name); // ͨ��Outer.this���ʸ����ʵ����ͨ��this�����Լ���ʵ��
		}
	}

	static class StaticNested {
		void hello() {
			System.out.println("Hello, " + Outer.age); // ֻ�ܷ��ʸ���ľ�̬����
		}
	}

	void asyncHello() {
		// �̳߳���
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello, " + Outer.this.name);
			}
		};
		new Thread(r).start();
	}
}
