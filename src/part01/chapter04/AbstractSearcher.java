package part01.chapter04;

public abstract class AbstractSearcher {
	protected IGoodBodyGirl goodBodyGirl;
	protected IGreatTemperamentGirl greatTemperamentGirl;
	
	public AbstractSearcher(IGoodBodyGirl _goodBodyGirl) {
		this.goodBodyGirl = _goodBodyGirl;
	}
	
	public AbstractSearcher(IGreatTemperamentGirl _greatTemperamentGirl) {
		this.greatTemperamentGirl = _greatTemperamentGirl;
	}
	
	public abstract void show();
}
