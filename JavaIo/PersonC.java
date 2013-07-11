import java.io.Serializable;

/**
 * 实现具有序列化能力的类
 */
public class PersonC implements Serializable {
	private transient String name;// 用关键字transient说明该属性不想被序列化保存
	int age;

	public PersonC() {

	}

	public PersonC(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "姓名：" + name + "年龄：" + age;
	}
}
