package part02.chapter12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("张三");
//		IGamePlayer proxy = player.getProxy();
//		System.out.println("开始时间是：2009-8-25 10:45");
//		proxy.login("zhangSan", "password");
//		proxy.killBoss();
//		proxy.upgrade();
//		System.out.println("结束时间是：2009-8-26 03:40");
		
		InvocationHandler handler = new GamePlayIH(player);
		System.out.println("开始时间是：2009-8-25 10:45");
		ClassLoader cl = player.getClass().getClassLoader();
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, 
				new Class[]{IGamePlayer.class}, handler);
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是：2009-8-26 03:40");
	}
}
