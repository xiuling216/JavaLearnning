
package JavaReflect;

import java.lang.reflect.Array;

/**
 * ͨ�������޸������С
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
	 * ��ӡ����
	 * 
	 * @param obj
	 *            ����
	 */
	private static void print(Object obj) {
		Class<?> arr = obj.getClass();
		if (!arr.isArray()) {
			return;
		}
		System.out.println("���鳤��Ϊ��" + Array.getLength(obj));
		System.out.print("����Ϊ��");
		for (int i = 0; i < Array.getLength(obj); i++) {
			System.out.print(Array.get(obj, i) + " ");
		}
	}

	/**
	 * �޸������С
	 * 
	 * @param obj
	 *            ����
	 * @param len
	 *            Ҫ�޸ĵ����鳤��
	 * @return �޸ĺ������
	 */
	private static Object arrayInc(Object obj, int len) {
		Class<?> arr = obj.getClass().getComponentType();
		Object newArr = Array.newInstance(arr, len);
		int objLen = Array.getLength(obj);
		System.arraycopy(obj, 0, newArr, 0, objLen);
		return newArr;
	}

}
