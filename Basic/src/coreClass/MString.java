package coreClass;

public class MString {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "HELLO".toLowerCase();
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		// 是否包含子串:
		"Hello".contains("ll"); // true
		"Hello".indexOf("l"); // 2
		// 提取子串
		"Hello".substring(2); // "llo"
		"Hello".substring(2, 4); // "ll"

		// TODO: 正则
		String s = "A,,B;C ,D";
		s.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"

		String s3 = "A,B,C,D";
		String[] ss = s3.split("\\,"); // {"A", "B", "C", "D"}

		String[] arr = { "A", "B", "C" };
		String s4 = String.join("***", arr); // "A***B***C"

		String s5 = "Hi %s, your score is %d!";  //%s 可以显示任何数据类型。
		System.out.println(s.formatted("Alice", 80));
		System.out.println(String.format(s5, "Bob", 66));
		
		// 转换为字符串
		String.valueOf(123); // "123"
		
		// 字符串转其他
		int n1 = Integer.parseInt("123"); // 123
		boolean b1 = Boolean.parseBoolean("true"); // true
		
		// 注： Java的String和char在内存中总是以Unicode编码表示。

	}
}
