package JavaReflect;

import java.lang.reflect.Field;

/**
 * ˽��������
 */
class Private {
	private String name = "echo";

	public String getName() {
		return name;
	}
}

/**
 * ͨ����������޸�˽��������
 */
public class Hello32 {
	public static void main(String[] args) throws Exception {
		Private p = new Private();
		Class<?> demo = p.getClass();
		Field field = demo.getDeclaredField("name");
		field.setAccessible(true);
		//����˽�����Ե�ָ
		//set()������һ��������ʾ����set�Ķ��󣬵ڶ�����������ȥ��ֵ 
		field.set(p, "lisi");
		System.out.println(p.getName());
	}
}
