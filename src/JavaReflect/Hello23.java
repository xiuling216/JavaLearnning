package JavaReflect;

import java.lang.reflect.*;

public class Hello23 {

	/**
	 * ���������set��get����
	 */
	public static void main(String[] args) {
		Class<?> demo = null;
		Object obj = null;
		try {
			demo = Class.forName("JavaReflect.PersonA");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			obj = demo.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		setter(obj, "Sex", "Ů", String.class);
		getter(obj, "Sex");
	}

	/**
	 * @param obj
	 *            �����Ķ���
	 * @param att
	 *            ����������
	 * @param value
	 *            ���õ�ֵ
	 * @param type
	 *            ����������
	 * */
	private static void setter(Object obj, String att, Object value,
			Class<?> type) {
		try {
			Method method = obj.getClass().getMethod("set" + att, type);
			method.invoke(obj, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param obj
	 *            �����Ķ���
	 * @param string
	 *            ����������
	 */
	private static void getter(Object obj, String att) {
		try {
			Method method = obj.getClass().getMethod("get" + att);
			System.out.println(method.invoke(obj));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
