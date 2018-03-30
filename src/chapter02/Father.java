package chapter02;

import java.util.Collection;
import java.util.Map;

public class Father {
	public Collection<? extends Number> doSomething(Map<? extends Number, ? extends Number> map) {
		System.out.println("父类被执行...");
		return map.values();
	}
}
