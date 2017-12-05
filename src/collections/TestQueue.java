package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestQueue {

	public static void main(String[] args) {
		Deque queuePersonnes = new ArrayDeque<>();
		queuePersonnes.addFirst(new Personne("nomMiddle", "prenomMiddle"));
		queuePersonnes.addFirst(new Personne("nomFirst", "prenomFirst"));
		queuePersonnes.addLast(new Personne("nomLast", "prenomLast"));
		
		for (Object object : queuePersonnes) {
			System.out.println(object);
		}

	}

}
