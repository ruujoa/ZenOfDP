package part01.chapter06;

import junit.framework.TestCase;

public class NovelBookTest extends TestCase {
	private String name = "平凡的世界";
	private int price = 6000;
	private String author = "路遥";
	
	private IBook novelBook = new NovelBook(name, price, author);
	
	public void testGetPrice() {
		super.assertEquals(this.price, this.novelBook.getPrice());
	}
}
