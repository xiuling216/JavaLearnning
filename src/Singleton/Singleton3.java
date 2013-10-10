package Singleton;

/**
 * @echo 2013-10-10
 * ����
 */
public class Singleton3 {
	private static Singleton3 instance = new Singleton3();

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return instance;
	}
}
