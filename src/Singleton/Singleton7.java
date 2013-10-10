package Singleton;

/**
 * @echo 2013-10-10 Ë«ÖØÐ£ÑéËø1
 */
public class Singleton7 {
	private static Singleton7 instance = null;

	private Singleton7() {
	}

	public static Singleton7 getSingleton() {
		if (instance == null) {
			synchronized (Singleton7.class) {
				Singleton7 temp = instance;
				if (temp == null) {
					temp = new Singleton7();
					instance = temp;
				}
			}
		}
		return instance;
	}
}

