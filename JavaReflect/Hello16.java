package JavaReflect;

public class Hello16 {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("JavaReflect.PersonA");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> tmp = demo.getSuperclass();
		System.out.println("¼Ì³ÐµÄ¸¸Àà£º" + tmp);
	}
}
