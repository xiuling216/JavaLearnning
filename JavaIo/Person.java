import java.io.Serializable;

/**
 * ʵ�־������л���������
 */
public class Person implements Serializable{
	String name;
	int age;
	public Person(){
		
	}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	public String toString(){
		return "������"+name+"���䣺"+age;
	}
}

