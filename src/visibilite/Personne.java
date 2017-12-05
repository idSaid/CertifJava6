package visibilite;

public class Personne {

	static int sharedVar;
	
	//initialisation dans le bloc static oubien instantané int sharedVar=10;
	static{
		sharedVar=10;
	}
	
	//constante
	static final int cste=20; // initialisation obligatoire car static
	final int finalCste; // doit etre initialiser obligatoirement dans tous les constructeurs
	
	public Personne(){
		sharedVar= 10;		
		finalCste=20;
	}
	
	
}
