package Singleton;

/**
 * @echo 2013-10-10 ���� �̲߳���ȫ
 */
public class Singleton1 {
	private static Singleton1 instance;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}
