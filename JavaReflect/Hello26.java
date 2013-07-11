
package JavaReflect;

import java.lang.reflect.Array;

/**
 * 通过反射修改数组大小
 */
public class Hello26 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] newArr = (int[]) arrayInc(arr, 15);
		print(newArr);
		System.out.println("\n============================");

		String[] str = { "aa", "bb", "cc" };
		String[] newStr = (String[]) arrayInc(str, 7);
		print(newStr);
	}

	/**
	 * 打印数组
	 * 
	 * @param obj
	 *            数组
	 */
	private static void print(Object obj) {
		Class<?> arr = obj.getClass();
		if (!arr.isArray()) {
			return;
		}
		System.out.println("数组长度为：" + Array.getLength(obj));
		System.out.print("数组为：");
		for (int i = 0; i < Array.getLength(obj); i++) {
			System.out.print(Array.get(obj, i) + " ");
		}
	}

	/**
	 * 修改数组大小
	 * 
	 * @param obj
	 *            数组
	 * @param len
	 *            要修改的数组长度
	 * @return 修改后的数组
	 */
	private static Object arrayInc(Object obj, int len) {
		Class<?> arr = obj.getClass().getComponentType();
		Object newArr = Array.newInstance(arr, len);
		int objLen = Array.getLength(obj);
		System.arraycopy(obj, 0, newArr, 0, objLen);
		return newArr;
	}

}
