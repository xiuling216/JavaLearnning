import java.io.Serializable;

/**
 * 实现具有序列化能力的类
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
		return "姓名："+name+"年龄："+age;
	}
}

