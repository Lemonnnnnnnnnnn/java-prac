package genericity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Number> list = new ArrayList(); // 自动推断
//		List<Number> list = new ArrayList<Number>();

		Person[] ps = new Person[] { new Person("Bob", 61), new Person("Alice", 88), new Person("Lily", 75), };
		Arrays.sort(ps);
		System.out.println(Arrays.toString(ps));
	}
}

/**
 * 如何实现Arrays的sort方法：  https://blog.csdn.net/zouzong123/article/details/81097109
 * 原理：
 * 定义一个Comparable接口，接口包含compareTo(Object)方法，return true||false
 * 定义一个Arrays类，包含sort(Object)方法，方法对要排序的object数组进行以下操作：
 * 	1. 数组元素a,b 强转为Comparable接口类型（接口是特殊的类，类继承于object，强转成功）
 * 	2. a.compareTo(b)实现比较排序
 * 
 */
class Person implements Comparable<Person> {
	String name;
	int score;

	Person(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public int compareTo(Person other) { // 实现compareable接口的方法
//		return name.compareTo(other.name);  // 调用String类的compareTo方法，返回比大小的结果
		return ~name.compareTo(other.name);  // 取反
	}
	
	public String toString() {
        return this.name + "," + this.score;
    }
}

