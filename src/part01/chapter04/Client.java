package part01.chapter04;

public class Client {
	public static void main(String[] args) {
		IGoodBodyGirl yanYan = new PettyGirl("嫣嫣");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
	}
}
