
package JavaReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * 通过Class实例化其他类的对象
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
		// 取得全部的构造函数
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
		System.out.println("打印方法");
		Method[] methods = cl.getDeclaredMethods();
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
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(" );");
		}
	}

	public static void printConstructors(Class cl) {
		System.out.println("打印构造函数");
		Constructor[] methods = cl.getConstructors();
			for (int i = 0; i < methods.length; i++) { 
	            System.out.println("构造方法：  "+methods[i]); 
	        } 
	}
}
