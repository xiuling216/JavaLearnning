/**
 * 
 */
package JavaReflect;

import java.lang.reflect.Field;

/**
 * ͨ�������������
 */
public class Hello24 {
	public static void main(String[] args) {
		Class<?> demo = null;
		Object obj = null;
		try {
			demo = Class.forName("JavaReflect.PersonA");

			obj = demo.newInstance();
			Field field = demo.getDeclaredField("sex");
			field.setAccessible(true);
			field.set(obj, "��");
			System.out.println(field.get(obj));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
