package Demo;

public class MyConstruction {
	private String name;
	private int age;
	
	public MyConstruction(String n,int a) {
		this.name = n;
		this.age = a;
	}
	
	public MyConstruction(String n) {
		this(n, 18);  // 调用另一个构造方法Person(String, int)
	}
	
	public MyConstruction() {
		this("uname");  // 调用另一个构造方法Person(String)
	}
}
