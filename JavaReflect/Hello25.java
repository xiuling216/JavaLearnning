/**
 * 
 */
package JavaReflect;

import java.lang.reflect.Array;

/**
 * 通过反射取得并修改数组的信息
 */
public class Hello25 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Class<?> demo = arr.getClass().getComponentType();
		System.out.println("数组类型：" + demo.getName());
		System.out.println("数组长度：" + Array.getLength(arr));
		System.out.println("第一个元素：" + Array.get(arr, 0));
		Array.set(arr, 0, 1000);
		System.out.println("第一个元素：" + Array.get(arr, 0));
	}

}
