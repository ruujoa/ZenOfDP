package chapter02;

import java.util.Collection;
import java.util.HashMap;

public class Son extends Father {
	public Collection<? extends Number> doSomething(HashMap<? extends Number, ? extends Number> map) {
		System.out.println("子类被执行...");
		return map.values();
	}
}
