package Singleton;

/**
 * @echo 2013-10-10
 * �������̰߳�ȫ
 */
public class Singleton2 {
	private static Singleton2 instance;

	public Singleton2() {
	}

	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

}
