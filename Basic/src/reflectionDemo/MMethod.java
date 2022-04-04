package reflectionDemo;

import java.lang.reflect.Method;

public class MMethod {
	public static void main(String[] args) throws Exception {
	    Method h = Person1.class.getMethod("hello");
        // 对Student实例调用hello方法:
        h.invoke(new Student()); // 调用的是覆写后的方法，调用需要传入实例
        
        Method h2 = Person1.class.getDeclaredMethod("run", String.class); // 需要传入参数，以处理多态情况
        h2.setAccessible(true);
        h2.invoke(null, "hello");
	}
}



class Person1 {
    public void hello() {
        System.out.println("Person:hello");
    }
    private static void run(String s) {
        System.out.println(s + "!!!");
    }
}

class Student extends Person1 {
	@Override
    public void hello() {
        System.out.println("Student:hello");
    }
}
