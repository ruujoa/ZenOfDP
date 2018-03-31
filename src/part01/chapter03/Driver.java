package part01.chapter03;

public class Driver implements IDriver {
	
	private ICar car;
	
	public Driver() {
		
	}
	
	// 构造函数注入
	public Driver(ICar _car) {
		this.car = _car;
	}
	
	@Override
	public void drive(ICar car) {
		this.car.run();
	}

	@Override
	public void setCar(ICar car) {
		this.car = car;
	}
}
