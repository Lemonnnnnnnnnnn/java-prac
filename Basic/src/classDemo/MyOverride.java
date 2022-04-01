package classDemo;

import java.util.Arrays;

abstract class Person {
	// final: һ�����������޸�
	protected final String name;

	public Person() {
		this.name = "uname";
	}

	public Person(String n) {
		this.name = n;
	}
	
	// �����壬������ʵ��
	public abstract void  run();
	
	// ��������д
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
		if(o instanceof Person) { // �Ƿ���Person��ʵ��
			Person p = (Person)o;
			if(this.name.equals(p.name)){ // �Ƿ�name���
				return true;
			}
			return false;
		}
		return false;
	}
	
	// ����hash:
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}

// ���ܱ��̳е���
final class Unique{
	
}

class Student extends Person {
	protected int id;
//	@Override
	// @Override��У���Ƿ�����ͷ���ֵ��������ͬ
	public void run() {

	}
	
	public Student(String n , int num) {
		super(n); // �Զ����ø���Ĺ��췽��
		id = num;
	}
	
	@Override
		public String hello() {
			// TODO Auto-generated method stub
			return super.hello() + "!"; // ���ø���ķ���
		}
}

//һ��java�ļ�����д���class�Ļ��������������һ��public�ġ�
// ����.java�����ƺ�public �������Ҫһ��
public class MyOverride {
	public static void main(String[] args) {
		Student s = new Student("XIAO MING" , 1);
		System.out.println(s.toString());
	}
}
