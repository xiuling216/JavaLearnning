package JavaReflect;

/**
 * ͨ��һ�������������İ���������
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

		System.out.println("�����ƣ�" + demo1.getName());
		System.out.println("�����ƣ�" + demo2.getName());
		System.out.println("�����ƣ�" + demo3.getName());
	}

}
