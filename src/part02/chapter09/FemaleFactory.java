package part02.chapter09;

public class FemaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

}
