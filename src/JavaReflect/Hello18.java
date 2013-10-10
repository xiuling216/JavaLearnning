package JavaReflect;

import java.lang.reflect.*;

public class Hello18 {
	public static void main(String[] args) {
		System.out.println("��ӡ����");
		Class<?> demo = null;
		try {
			demo = Class.forName("JavaReflect.PersonA");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Method[] methods = demo.getDeclaredMethods();
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
				System.out.print(paramTypes[j].getName()+" arg"+j);
			}
			System.out.println(" );");
		}

	}

}
