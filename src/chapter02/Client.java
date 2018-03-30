package chapter02;

import java.util.HashMap;

public class Client {
	public static void main(String[] args) {
//		Soldier sanMao = new Soldier();
//		sanMao.setGun(new ToyGun());
//		sanMao.killEnemy();
		
//		Snipper sanMao = new Snipper();
//		sanMao.killEnemy((AUG) new Rifle());
		
		invoker();
	}
	
	public static void invoker() {
//		Father f = new Father();
		Son f = new Son();
		HashMap<? extends Number, ? extends Number> map = new HashMap<>();
		f.doSomething(map);
	}
}
