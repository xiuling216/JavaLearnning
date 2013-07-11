package JavaReflect;

import java.lang.reflect.*;

/**
 * ȡ�����ȫ������
 */
public class Hello20 {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("JavaReflect.PersonA");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=============��������==========");
		// ȡ�ñ���ȫ������
		Field[] field = demo.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			// Ȩ�����η�
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			// ��������
			Class<?> type = field[i].getType();
			System.out.println(priv + " " + type.getName() + " "
					+ field[i].getName());
		}
		System.out.println("========ʵ�ֵĽӿڻ��߸��������======");
		Field[] field1 = demo.getFields();
		for (int i = 0; i < field1.length; i++) {
			// Ȩ�����η�
			int mo = field1[i].getModifiers();
			String priv = Modifier.toString(mo);
			// ��������
			Class<?> type = field1[i].getType();
			System.out.println(priv + " " + type.getName() + " "
					+ field1[i].getName());
		}
	}
}
