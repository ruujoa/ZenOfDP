package part02.chapter07;

public class SafeSingleton1 {
	private static final SafeSingleton1 singleton = new SafeSingleton1();
	
	private SafeSingleton1() {
		
	}
	
	public static SafeSingleton1 getSingleton() {
		return singleton;
	}
	
	public static void doSomething() {}
}
