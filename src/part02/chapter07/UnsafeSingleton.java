package part02.chapter07;

public class UnsafeSingleton {
	private static final UnsafeSingleton singleton = null;
	
	private UnsafeSingleton() {
		
	}
	
	public static UnsafeSingleton getSingleton() {
		if (singleton == null) new UnsafeSingleton();
		return singleton;
	}
	
	public static void doSomething() {}
}
