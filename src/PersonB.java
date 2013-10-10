import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * ʵ�־������л���������
 */
public class PersonB implements Externalizable {
	String name;
	int age;

	public PersonB() {

	}

	public PersonB(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "������" + name + "���䣺" + age;
	}

	// ��д���������������Ҫ���Ա�������Ի��߾������ݣ������л���ʱ��ʹ��
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.name);
		out.writeInt(age);
	}

	// ��д���������������Ҫ��ȡ���� �����л���ʱ����Ҫ
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		this.name = (String) in.readObject();
		this.age = in.readInt();

	}
}
