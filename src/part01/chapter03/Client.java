package part01.chapter03;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDriver zhangSan = new Driver();
		ICar benz = new Benz();
		zhangSan.drive(benz);
		
		ICar bmw = new BMW();
		zhangSan.drive(bmw);
	}

}
