package JavaReflect;

import java.lang.reflect.*;

public class Hello22 {
	/**
	 * ���÷�����������еķ���
	 */
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("JavaReflect.PersonA");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// ����PersonA��sayChina����
			Method method = demo.getMethod("sayChina");
			method.invoke(demo.newInstance());
			// ����PersonA��sayHello����
			method = demo.getMethod("sayHello", String.class, int.class);
			method.invoke(demo.newInstance(), "echo", 20);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
