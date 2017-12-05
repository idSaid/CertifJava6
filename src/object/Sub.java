package object;

public class Sub extends Super {

	public Sub(int a) {
		super(a);
	}

	public Sub(){
		this(5);
		// ou super(5);
		// this.a=5 ne marche pas car on doit avoir un appel explicit au constructeur super
	}
	
}
