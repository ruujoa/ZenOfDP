package part02.chapter12;

public interface IGamePlayer {
	public void login(String user, String password);
	public void killBoss();
	public void upgrade();
	public IGamePlayer getProxy();
}
