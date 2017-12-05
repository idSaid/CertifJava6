package passageParReference;

public class Batman {

	int squares = 81;
	
	void go(){
		incrByVal(++squares);
		System.out.println(squares);
		incrByRef(this);
		System.out.println(squares);
	}
	
	void incrByVal(int squares) {
		squares += 10;
	}
	
	void incrByRef(Batman b){
		this.squares += 10;
	}

	public static void main(String[] args) {
		new Batman().go();

	}

}
