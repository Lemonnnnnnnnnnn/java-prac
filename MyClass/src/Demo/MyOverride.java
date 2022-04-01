package Demo;

import java.util.Arrays;

abstract class Person {
	// final: 一旦创建不能修改
	protected final String name;

	public Person() {
		this.name = "uname";
	}

	public Person(String n) {
		this.name = n;
	}
	
	// 仅定义，由子类实现
	public abstract void  run();
	
	// 不允许被覆写
	public final void unique() {
		
	}
	
	public String hello() {
		return "Hello" + name;
	}

	@Override
	public String toString() {
		return "name=" + name;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) { // 是否是Person的实例
			Person p = (Person)o;
			if(this.name.equals(p.name)){ // 是否name相等
				return true;
			}
			return false;
		}
		return false;
	}
	
	// 计算hash:
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}

// 不能被继承的类
final class Unique{
	
}

class Student extends Person {
	protected int id;
//	@Override
	// @Override会校验是否参数和返回值和祖先相同
	public void run() {

	}
	
	public Student(String n , int num) {
		super(n); // 自动调用父类的构造方法
		id = num;
	}
	
	@Override
		public String hello() {
			// TODO Auto-generated method stub
			return super.hello() + "!"; // 调用父类的方法
		}
}

//一个java文件里面写多个class的话，这里面最多有一个public的。
// 而且.java的名称和public 类得名称要一致
public class MyOverride {
	public static void main(String[] args) {
		Student s = new Student("XIAO MING" , 1);
		System.out.println(s.toString());
	}
}
