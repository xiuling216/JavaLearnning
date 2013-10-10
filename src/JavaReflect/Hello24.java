/**
 * 
 */
package JavaReflect;

import java.lang.reflect.Field;

/**
 * 通过反射操作属性
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
			field.set(obj, "男");
			System.out.println(field.get(obj));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
