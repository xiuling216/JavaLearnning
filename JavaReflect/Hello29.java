package JavaReflect;

/**
 * ���ģʽ֮����ģʽ
 */
interface fruit {
	public abstract void eat();
}

class Apple implements fruit {
	public void eat() {
		System.out.println("Apple");
	}
}

class Orange implements fruit {
	public void eat() {
		System.out.println("Orange");
	}
}

/**
 * ���칤�� Ҳ����˵�Ժ�������������������ʵ����ʱ��ֻ��Ҫ�޸Ĺ����������
 */
class Factory {
	public static fruit getInstance(String fruitName) {
		fruit f = null;
		if ("Apple".equals(fruitName)) {
			f = new Apple();
		}
		if ("Orange".equals(fruitName)) {
			f = new Orange();
		}
		return f;
	}
}

public class Hello29 {
	public static void main(String[] args) {
		fruit f = Factory.getInstance("Apple");
		f.eat();
	}
}
