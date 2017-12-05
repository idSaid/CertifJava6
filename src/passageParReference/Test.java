package passageParReference;

public class Test {

	public static void main(String[] args) {
		Personne p1= new Personne();
		Personne p2= p1;
		
		p1.nom="aaa";
		p2.nom="bbb";
		
		System.out.println(p1.nom);
		// affiche bbb car p1 et p2 pointent sur le meme objet
		// remède : utiliser cloonable
		

	}

}
