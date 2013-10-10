package JavaReflect;

import java.lang.reflect.Field;

/**
 * 私有属性类
 */
class Private {
	private String name = "echo";

	public String getName() {
		return name;
	}
}

/**
 * 通过反射机制修改私有属性名
 */
public class Hello32 {
	public static void main(String[] args) throws Exception {
		Private p = new Private();
		Class<?> demo = p.getClass();
		Field field = demo.getDeclaredField("name");
		field.setAccessible(true);
		//重设私有属性的指
		//set()方法第一个参数表示调用set的对象，第二个参数填充进去的值 
		field.set(p, "lisi");
		System.out.println(p.getName());
	}
}
