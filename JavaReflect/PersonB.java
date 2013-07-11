package JavaReflect;

public class PersonB {
	private String name;
	private int age;

	public PersonB() {
	}

	public PersonB(String name) {
		this.name = name;
	}

	public PersonB(int age) {
		this.age = age;
	}

	public PersonB(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "[" + this.name + " " + this.age + "]";
	}
}
