package singleton;

public class Hungry {
	private static Hungry hungry = new Hungry();
	
	public Hungry() {
		
	}
	
	public static Hungry getInstance() {
		return hungry;
	}
}
