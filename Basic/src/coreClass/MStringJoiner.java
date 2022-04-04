package coreClass;

import java.util.StringJoiner;

public class MStringJoiner {
	public static void main(String[] args) {
		String[] names = { "Bob", "Alice" };
		var sj = new StringJoiner(", ","Hello ","!");
		for (String name : names) {
			sj.add(name);
		}
		System.out.println(sj.toString());
	}
}
