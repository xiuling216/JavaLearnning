import java.io.Serializable;

/**
 * ʵ�־������л���������
 */
public class PersonC implements Serializable {
	private transient String name;// �ùؼ���transient˵�������Բ��뱻���л�����
	int age;

	public PersonC() {

	}

	public PersonC(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "������" + name + "���䣺" + age;
	}
}
