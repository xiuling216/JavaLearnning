package JavaReflect;

import java.lang.reflect.*;

public class Hello18 {
	public static void main(String[] args) {
		System.out.println("打印方法");
		Class<?> demo = null;
		try {
			demo = Class.forName("JavaReflect.PersonA");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Method[] methods = demo.getDeclaredMethods();
		for (Method m : methods)// 循环该类的每个方法
		{
			Class retType = m.getReturnType();// 该方法的返回类型，
			String name = m.getName();// 获得方法名
			System.out.print(" " + Modifier.toString(m.getModifiers()));// 打印方法修饰符
			System.out.print(" " + retType.getName() + " " + name + "(");
			Class[] paramTypes = m.getParameterTypes();// 获得一个方法参数数组（getparameterTypes用于返回一个描述参数类型的Class对象数组）
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0)
					System.out.print(" , "); // 如果有多个参数，中间则用逗号隔开，否则直接打印参数
				System.out.print(paramTypes[j].getName()+" arg"+j);
			}
			System.out.println(" );");
		}

	}

}
