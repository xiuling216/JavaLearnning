package Singleton;

/**
 * @echo 2013-10-10 ¾²Ì¬ÄÚ²¿Àà
 */
public class Singleton5 {
	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	private Singleton5() {
	}

	public static final Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
