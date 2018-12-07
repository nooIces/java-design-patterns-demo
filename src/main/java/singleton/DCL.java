package singleton;

public class DCL {
	private static volatile DCL dcl;
	
	public DCL() {
		
	}
	
	public static DCL getInstance() {
		if(dcl == null) {
			synchronized(DCL.class) {
				if(dcl == null) {
					dcl = new DCL();
				}
			}
		}
		return dcl;
	}
}
