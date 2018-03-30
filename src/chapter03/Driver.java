package chapter03;

public class Driver implements IDriver {
	@Override
	public void drive(ICar car) {
		car.run();
	}
}
