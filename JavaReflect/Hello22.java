package JavaReflect;

import java.lang.reflect.*;

public class Hello22 {
	/**
	 * 利用反射调用他类中的方法
	 */
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("JavaReflect.PersonA");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// 调用PersonA中sayChina方法
			Method method = demo.getMethod("sayChina");
			method.invoke(demo.newInstance());
			// 调用PersonA中sayHello方法
			method = demo.getMethod("sayHello", String.class, int.class);
			method.invoke(demo.newInstance(), "echo", 20);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
