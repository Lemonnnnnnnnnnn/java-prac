package genericity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MArrays { 
	public static <L> L[] createArray(Class<L> cls , int length) { // 泛型数组通过Class实体创建实例
		return (L[]) Array.newInstance(cls, length); // 
	}


	public static void main(String[] args) {
		Number []arr2 = createArray(Number.class, 5);
		arr2[0] = 1;
		
		System.out.println(Arrays.toString(arr2));
	}
}

