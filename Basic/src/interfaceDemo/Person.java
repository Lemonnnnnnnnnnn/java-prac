package interfaceDemo;

// 接口可看作纯粹的抽象类
// 抽象类的方法必须要被实现
// 写不写public abstract 效果都一样
// 接口没有实例属性,但可以有静态属性
interface Person {
//	public static final String aString = "123";
	String a = "123";
	default void run() { // 默认方法
		System.out.println(getName() + " run");
	}

	String getName();
}
