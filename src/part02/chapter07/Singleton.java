package part02.chapter07;

public class Singleton {
	private static final Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	
	public static void doSomething() {}
}