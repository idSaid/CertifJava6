package exactExam;

public class TestDeclareStuff implements DeclareStuff {

	public static void main(String[] args) {
		

	}

	@Override
	public void doStuff(int t) { // cannot reduce the visibilty void doStuff(int t) not permitted
		t += EASY + ++t;
		
	}

}
