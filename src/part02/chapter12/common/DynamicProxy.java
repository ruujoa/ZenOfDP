package part02.chapter12.common;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(ClassLoader loader, 
		Class<?>[] interfaces, InvocationHandler h) {
		if (true)
			(new BeforeAdvice()).exec();
		// 执行目标，并返回结果
		return (T)Proxy.newProxyInstance(loader, interfaces, h);
	}
}
