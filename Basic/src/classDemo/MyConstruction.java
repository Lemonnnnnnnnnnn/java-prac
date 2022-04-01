package classDemo;

public class MyConstruction {
	private String name;
	private int age;
	
	public MyConstruction(String n,int a) {
		this.name = n;
		this.age = a;
	}
	
	public MyConstruction(String n) {
		this(n, 18);  // ������һ�����췽��Person(String, int)
	}
	
	public MyConstruction() {
		this("uname");  // ������һ�����췽��Person(String)
	}
}
