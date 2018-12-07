package singleton;

public class StaticBlock {
	
	private static StaticBlock staticBlock;
	
	public StaticBlock() {
		System.out.println("123");
	}
	
	static {
		System.out.println("456");
		staticBlock = new StaticBlock();
	}
	
	public static StaticBlock getInstance() {
		System.out.println("789");
		return staticBlock;
	}
}
