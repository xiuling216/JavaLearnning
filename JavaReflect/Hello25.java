/**
 * 
 */
package JavaReflect;

import java.lang.reflect.Array;

/**
 * ͨ������ȡ�ò��޸��������Ϣ
 */
public class Hello25 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Class<?> demo = arr.getClass().getComponentType();
		System.out.println("�������ͣ�" + demo.getName());
		System.out.println("���鳤�ȣ�" + Array.getLength(arr));
		System.out.println("��һ��Ԫ�أ�" + Array.get(arr, 0));
		Array.set(arr, 0, 1000);
		System.out.println("��һ��Ԫ�أ�" + Array.get(arr, 0));
	}

}
