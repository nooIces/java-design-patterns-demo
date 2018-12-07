package singleton;

public class StaticInnerClass {
	private static class StaticInnerClassHolder {
		private static StaticInnerClass 
			staticInnerClass = new StaticInnerClass();
	}
	
	public StaticInnerClass() {
		
	}
	
	public static StaticInnerClass getInstance() {
		return StaticInnerClassHolder.staticInnerClass;
	}
}
