package part02.chapter07;

public class SafeSingleton3 {
	static class SingletonHolder {  
        static SafeSingleton3 instance = new SafeSingleton3();  
    }  
      
    public static SafeSingleton3 getInstance(){  
        return SingletonHolder.instance;  
    }
}
