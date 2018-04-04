package part02.chapter08;

import java.lang.reflect.Constructor;

public class SingletonFactory {
	private static Singleton singleton;
	
	static {
		try {
			Class<?> cl = Class.forName(Singleton.class.getName());
			Constructor<?> constructor = cl.getDeclaredConstructor();
			constructor.setAccessible(true);
			singleton = (Singleton) constructor.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
}
