package part02.chapter09;

public class MaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

}
