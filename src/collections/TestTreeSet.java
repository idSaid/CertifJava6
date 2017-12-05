package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<PersonneWithComparable> treeSetPersonnes= new TreeSet<>();
		
		for (int i = 6; i > 0; i--) {
			treeSetPersonnes.add(new PersonneWithComparable("nom"+i, "prenom"+i));
		}
		
		for (PersonneWithComparable personneWithComparable : treeSetPersonnes) {
			System.out.println(personneWithComparable);
		}

		System.out.println("************************");
		System.out.println(treeSetPersonnes.tailSet(new PersonneWithComparable("nom0","prenom0")));
		
		System.out.println("************************");
		String elements[] = { "A", "C", "D", "G", "F" };
	    TreeSet set = new TreeSet(Arrays.asList(elements));

	    System.out.println(set.tailSet("C"));
	    System.out.println(set.headSet("C"));
	    System.out.println(set.headSet("C\0"));
	    System.out.println(set.tailSet("C\0"));
	    System.out.println(set.subSet("C", "F\0"));
	    System.out.println(set.subSet("C", "C\0"));
	    System.out.println(set.subSet("C", "C"));
	}

}
