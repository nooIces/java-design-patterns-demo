package singleton;

public class EnumSingle {
	private enum EnumSingleHolder{
		holder;
		private EnumSingle enumSingle;
		
		private EnumSingleHolder() {
			enumSingle = new EnumSingle();
		}
		
		private EnumSingle get() {
			return enumSingle;
		}
	}
	
	public static EnumSingle getInstance() {
		return EnumSingleHolder.holder.get();
	}
}
