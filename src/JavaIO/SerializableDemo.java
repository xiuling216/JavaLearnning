package JavaIO;
import java.io.Serializable;

/**
 * ʵ�־������л���������
 */
public class SerializableDemo implements Serializable {
	String name;
	int age;

	public SerializableDemo() {
	}

	public SerializableDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "������" + name + "���䣺" + age;
	}
}
