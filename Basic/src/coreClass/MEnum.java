package coreClass;

public class MEnum {
	public static void main(String[] args) {
		String s = Color.RED.name();

		Weekday day = Weekday.SUN;
		
		switch (day) {
		case MON: //  switch自动带类型校验，所以可以简写Weekday.MON为 MON
		case TUE:
		case WED:
		case THU:
		case FRI:
			System.out.println("Today is " + day + ". Work at office!");
			break;
		case SAT:
		case SUN:
			System.out.println("Today is " + day + ". Work at home!");
			break;
		default:
			throw new RuntimeException("cannot process " + day);
		}
	}

}

// 枚举的构造函数
enum Weekday {
	// 绑定唯一值
	MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);

	public final int dayValue;

	private Weekday(int dayValue) {
		this.dayValue = dayValue;
	}
}

enum Color {
	RED, GREEN, BLUE;
}

// 编译结果类似于：
// public final class Color extends Enum { // 继承自Enum，标记为final class
//	    // 每个实例均为全局唯一:
//	    public static final Color RED = new Color();
//	    public static final Color GREEN = new Color();
//	    public static final Color BLUE = new Color();
//	    // private构造方法，确保外部无法调用new操作符:
//	    private Color() {}
//	}