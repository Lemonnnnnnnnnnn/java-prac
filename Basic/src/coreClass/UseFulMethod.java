package coreClass;

public class UseFulMethod {

	static double getRandom(double low, double high) {
		// 我们创建Random实例时，如果不给定种子，就使用系统当前时间戳作为种子，因此每次运行时，种子不同，得到的伪随机数序列就不同。
		double x = Math.random();
		return x * (high - low) + low;
	}

	public static void main(String[] args) {
		System.out.println(getRandom(10, 50));
	}

}
