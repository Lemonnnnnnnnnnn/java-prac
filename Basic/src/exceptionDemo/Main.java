package exceptionDemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
	// main 是最后捕获异常的机会，如果不捕获异常，则无法通过编译
	public static void main(String[] args) throws Exception {
		// 在方法名处声明可能出现的异常【throws】，是一种状态声明，以便编译器进行代码审核
		// throw : 主动抛出异常 ，在try中抛给catch ， 在catch中抛给上一级
		try {
			byte[] bs = toGBK("中文");
			System.out.println(Arrays.toString(bs));
		} catch (UnsupportedEncodingException e) {
			System.out.println(e);
		}
	}
	
	static byte[] toGBK(String s) throws UnsupportedEncodingException {
		try {
			return s.getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			/*
			 * e.getCause():获取异常原因，获取Cause 
			 * e.toString(): 获取异常种类和错误信息
			 * e.getMessage(): 获取错误信息
			 * e.printStackTrace():
			 * 对象的堆栈跟踪输出至错误输出流，放在System.err中，并在控制台打印出来，包括异常种类，错误信息，错误位置。
			 */
			e.printStackTrace();
			throw new IllegalArgumentException(e); // 转换异常类型，但是传入e，保证异常栈不会丢失信息
		} finally {
			System.out.println("finally 总会执行"); // 若进入catch，会先执行finally后执行catch
		}
	}

}