package object;

public class ADoit {

	public String doit(int x, int y){
		return "a";
	}
	
	public String doit(int... vals){
		return "b";
	}
	
	public static void main(String[] args) {
		ADoit aDoit = new ADoit();
		System.out.println(aDoit.doit(4, 5));
		System.out.println(aDoit.doit(1, 4, 5, 6));
	}

}
