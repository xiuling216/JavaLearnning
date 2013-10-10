package JavaReflect;

/**
 * 利用反射机制修改工厂类
 */
class FactoryReflect {
	public static fruit getInstance(String className) {
		fruit f = null;
		try {
			f = (fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}

public class Hello30 {
	public static void main(String[] args) {
		fruit f = FactoryReflect.getInstance("JavaReflect.Apple");
		if (f != null) {
			f.eat();
		}
	}
}
