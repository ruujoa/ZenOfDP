package part01.chapter03;

public interface IDriver {
	// Setter注入依赖
	public void setCar(ICar car);
	public void drive(ICar car);
}
