package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Personne> ListPersonnes = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			ListPersonnes.add(new Personne("nom "+i,"prenom "+i));			
		}
		
		System.out.println("******************");
		System.out.println("List size");
		System.out.println(ListPersonnes.size());
		
		System.out.println("******************");
		System.out.println("parcours foreach");
		for (Personne personne : ListPersonnes) {
			System.out.println(personne);
		}
		
		System.out.println("******************");
		System.out.println("parcours for");
		for (int i = 0; i < 6; i++) {
			System.out.println(ListPersonnes.get(i));
		}
		
		System.out.println("******************");
		System.out.println("parcours iterator");
		Iterator iterator=ListPersonnes.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}

		System.out.println("******************");
		System.out.println("parcours listIterator");
		ListIterator<Personne> iteratorInverse= ListPersonnes.listIterator();
		iteratorInverse.next();
		while(iteratorInverse.hasPrevious()){
			System.out.println(iteratorInverse.previous());
		}
		
		System.out.println("******************");
		System.out.println("subList from 2 to 4");
		List<Personne> subList= ListPersonnes.subList(2, 5);
		for (Personne personne : subList) {
			System.out.println(personne);
		}
		
		System.out.println("******************");
		System.out.println("ArrayList.toArray()");
		Object[] arrayOfPersonnes = ListPersonnes.toArray();
		for (int i = 0; i < arrayOfPersonnes.length; i++) {
			System.out.println(arrayOfPersonnes[i]);
		}
	}

}
