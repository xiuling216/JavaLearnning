
package JavaReflect;

/*
 * ͨ��Classʵ����������Ķ���
 */
public class hello13 {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("Reflect.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Person per = null;
		try {
			per = (Person) demo.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		per.setName("echo");
		per.setAge(20);
		System.out.println(per);
	}
}
