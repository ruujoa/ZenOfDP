package part02.chapter07;

public class SafeSingleton2 {
	private volatile SafeSingleton2 instance = null;  
    public SafeSingleton2 getInstance() {  
        if (instance == null) {  
            synchronized(this) {  
                if (instance == null) {  
                    instance = new SafeSingleton2();  
                }  
            }  
        }  
        return instance;  
    }
}
