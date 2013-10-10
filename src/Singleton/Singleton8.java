package Singleton;

/**
 * @echo 2013-10-10
 * Ë«ÖØÐ£ÑéËø2
 */
public class Singleton8 {
	private volatile static Singleton8 singleton;

	private Singleton8() {
	}

	public static Singleton8 getSingleton() {
		if (singleton == null) {
			synchronized (Singleton8.class) {
				if (singleton == null) {
					singleton = new Singleton8();
				}

			}
		}
		return singleton;
	}
}
