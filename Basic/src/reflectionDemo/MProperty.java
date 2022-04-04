package reflectionDemo;

import java.lang.reflect.Field;

//反射更多地是给工具或者底层框架来使用，目的是在不知道目标实例任何信息的情况下，获取特定字段的值。
public class MProperty {
	 public static void main(String[] args) throws Exception {
	        Person p = new Person("Xiao Ming"); // 新建一个实例
	        Class c = p.getClass(); // 获取类的Class实体
	        Field f = c.getDeclaredField("name"); // getDeclaredField 可以访问私有属性
	        
	        f.setAccessible(true); // 不论属性是否为私有都可以访问
	        Object value = f.get(p);  // field.get(Object) 获取实例的某属性值
	        f.set(p, "xiao zhang");  // 
	        System.out.println(value); 
	        System.out.println(p.getName()); 
	    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}