package JavaReflect;

/**
 * 获得类加载器
 */
public class Hello27 {
	public static void main(String[] args) {
		Hello27 t = new Hello27();
		System.out.println("类加载器："
				+ t.getClass().getClassLoader().getClass().getName());
	}
}
