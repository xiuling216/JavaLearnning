
package JavaReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * ͨ��Classʵ����������Ķ���
 */
public class hello14 {
	public static void main(String[] args) throws SecurityException,
			NoSuchMethodException {
		Class<?> demo = null;
		try {
			demo = Class.forName("JavaReflect.PersonB");
		} catch (Exception e) {
			e.printStackTrace();
		}
		PersonB per1 = null;
		PersonB per2 = null;
		PersonB per3 = null;
		PersonB per4 = null;

		printMethods(demo);
		printConstructors(demo);
		// ȡ��ȫ���Ĺ��캯��
		Constructor cons0 = demo.getConstructor();
		Constructor cons1 = demo.getConstructor(String.class);
		Constructor cons2 = demo.getConstructor(int.class);
		Constructor cons3 = demo.getConstructor(String.class, int.class);

		try {
			per1 = (PersonB) cons0.newInstance();
			per2 = (PersonB) cons1.newInstance("echo");
			per3 = (PersonB) cons2.newInstance(20);
			per4 = (PersonB) cons3.newInstance("echo", 20);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
		System.out.println(per4);
	}

	public static void printMethods(Class cl) {
		System.out.println("��ӡ����");
		Method[] methods = cl.getDeclaredMethods();
		for (Method m : methods)// ѭ�������ÿ������
		{
			Class retType = m.getReturnType();// �÷����ķ������ͣ�
			String name = m.getName();// ��÷�����
			System.out.print(" " + Modifier.toString(m.getModifiers()));// ��ӡ�������η�
			System.out.print(" " + retType.getName() + " " + name + "(");
			Class[] paramTypes = m.getParameterTypes();// ���һ�������������飨getparameterTypes���ڷ���һ�������������͵�Class�������飩
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0)
					System.out.print(" , "); // ����ж���������м����ö��Ÿ���������ֱ�Ӵ�ӡ����
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(" );");
		}
	}

	public static void printConstructors(Class cl) {
		System.out.println("��ӡ���캯��");
		Constructor[] methods = cl.getConstructors();
			for (int i = 0; i < methods.length; i++) { 
	            System.out.println("���췽����  "+methods[i]); 
	        } 
	}
}
