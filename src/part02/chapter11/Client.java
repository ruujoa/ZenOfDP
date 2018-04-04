package part02.chapter11;

//import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
//		ArrayList<String> sequence = new ArrayList<>();
//		sequence.add("engineboom");
//		sequence.add("start");
//		sequence.add("stop");
//		
//		BenzBuilder benzBuilder = new BenzBuilder();
//		benzBuilder.setSequence(sequence);
//		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
//		benz.run();
//		
//		BMWBuilder bmwBuilder = new BMWBuilder();
//		bmwBuilder.setSequence(sequence);
//		BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
//		bmw.run();
		
		Director director = new Director();
		for (int i = 0; i < 10_000; i++) {
			director.getABenzModel().run();
		}
		
		for (int i = 0; i < 1_000_000; i++) {
			director.getBBenzModel().run();
		}
		
		for (int i = 0; i < 10_000_000; i++) {
			director.getCBMWModel().run();
		}
	}
}
