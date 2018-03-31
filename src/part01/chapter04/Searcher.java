package part01.chapter04;

public class Searcher extends AbstractSearcher {

	public Searcher(IGoodBodyGirl _pettyGirl) {
		super(_pettyGirl);
	}
	
	public Searcher(IGreatTemperamentGirl _pettyGirl) {
		super(_pettyGirl);
	}

	@Override
	public void show() {
		System.out.println("--------美女信息如下：----"
				+ "-----------");
		super.goodBodyGirl.goodLooking();
		super.goodBodyGirl.niceFigure();
		if (super.greatTemperamentGirl != null)
			super.greatTemperamentGirl.greatTemperament();
	}

}
