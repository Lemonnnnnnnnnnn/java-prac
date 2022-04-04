package coreClass;

public class MRecord {
	public static void main(String[] args) {
		Point p = new Point(123, 456);
		System.out.println(p.x());
		System.out.println(p.y());
		System.out.println(p);
		
		var z = Point3.of();
		var z2 = Point3.of(123,456);
	}
}

// 不变类、记录类，自带get方法
record Point(int x, int y) {
};

// 带校验
record Point2(int x, int y) {
    public Point2 {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
    }
}

// 常用的构造方法：of
record Point3(int x, int y) {
    public static Point3 of() {
        return new Point3(0, 0);
    }
    public static Point3 of(int x, int y) {
        return new Point3(x, y);
    }
}


