package JavaReflect;

/**
 * ����������
 */
public class Hello27 {
	public static void main(String[] args) {
		Hello27 t = new Hello27();
		System.out.println("���������"
				+ t.getClass().getClassLoader().getClass().getName());
	}
}
