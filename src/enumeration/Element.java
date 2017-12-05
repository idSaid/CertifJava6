package enumeration;

public enum Element {
	
	EARTH, WIND,
	FIRE{
		public String info(){
			return "Hot";
		}
	}
}
