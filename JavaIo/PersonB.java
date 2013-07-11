import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * 实现具有序列化能力的类
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
		return "姓名：" + name + "年龄：" + age;
	}

	// 复写这个方法，根据需要可以保存的属性或者具体内容，在序列化的时候使用
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.name);
		out.writeInt(age);
	}

	// 复写这个方法，根据需要读取内容 反序列话的时候需要
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		this.name = (String) in.readObject();
		this.age = in.readInt();

	}
}
