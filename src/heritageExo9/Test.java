package heritageExo9;

public class Test {

	public static void main(String[] args) {
		// cas 1
		new B().process();

		// cas 2
		A a= new B();
		try {
			a.process();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// cas 3
		((B) a).process();
		
		// ****************************************** //
		
		Fille f = (Fille) new Mere();
		f.methodeDeFille(); 
		// cette methode va déclancher une excéption car downcast (le cast ne change pas le type réel mais just le type déclaré)
		
	}

}
