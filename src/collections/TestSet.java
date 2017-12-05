package collections;

import java.util.HashSet;

public class TestSet {

	public static void main(String[] args) {
		
		HashSet<Personne> hashSetPersonnes = new HashSet<>();
		HashSet<PersonneWithHashCode> hashSetPersonnesWithHashCode= new HashSet<>();
		
		for (int i = 0; i < 6; i++) {
			hashSetPersonnes.add(new Personne("nom", "prenom"));
			hashSetPersonnesWithHashCode.add(new PersonneWithHashCode("nom", "prenom"));
		}
		
		System.out.println("***************");
		System.out.println("HashSetPersonnes contient tous les élements car ils ont des hashcodes differents");
		for (Personne personne : hashSetPersonnes) {
			System.out.println(personne+" hashCode: "+personne.hashCode());
		}
		
		System.out.println("***************");
		System.out.println("HashSetPersonnes ne contient pas de doublons quand ils ont les mêmes hashcodes");
		for (PersonneWithHashCode personneWithHashCode : hashSetPersonnesWithHashCode) {
			System.out.println(personneWithHashCode+" hashCode: "+personneWithHashCode.hashCode());
		}
		
		
	}

}
