package JavaReflect;

/**
 * 通过一个对象获得完整的包名和类名
 */
class Demo12 {

}

public class hello12 {

	public static void main(String[] args) {
		Class<?> demo1 = null;
		Class<?> demo2 = null;
		Class<?> demo3 = null;
		try {
			demo1 = Class.forName("Reflect.Demo12");
		} catch (Exception e) {
			e.printStackTrace();
		}
		demo2 = new Demo12().getClass();
		demo3 = Demo12.class;

		System.out.println("类名称：" + demo1.getName());
		System.out.println("类名称：" + demo2.getName());
		System.out.println("类名称：" + demo3.getName());
	}

}
