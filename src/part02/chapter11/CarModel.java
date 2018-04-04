package part02.chapter11;

import java.util.ArrayList;

public abstract class CarModel {
	private ArrayList<String> sequence = new ArrayList<>();
	
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	protected abstract void engineBoom();
	
	final public void run() {
		for (String action : sequence)
			if (action.equalsIgnoreCase("start"))
				this.start();
			else if (action.equalsIgnoreCase("stop"))
				this.stop();
			else if (action.equalsIgnoreCase("alarm"))
				this.alarm();
			else if (action.equalsIgnoreCase("engineboom"))
				this.engineBoom();
	}
	
	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
}
