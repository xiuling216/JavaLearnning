package JavaReflect;

/**
 * 设计模式之工厂模式
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
 * 构造工厂 也就是说以后如果我们在添加其他的实例的时候只需要修改工厂类就行了
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
