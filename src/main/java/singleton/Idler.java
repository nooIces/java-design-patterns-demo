package singleton;

public class Idler {
	private static Idler idler;
	
	public Idler() {
		
	}
	
	public static Idler getInstance() {
		synchronized(Idler.class) {
			if(idler == null) {
				idler = new Idler();
			}
			return idler;
		}
	}
}
