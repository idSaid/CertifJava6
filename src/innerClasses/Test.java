// on ne peut pas acceder aux methodes de la classe englob�e si elle n est pas statique
// pour y acceder on utilise une m�thode de l objet instenti� de la classe englob� dans la classe englobante
// si la classe englob�e �t� statique on aurai pu y acceder en cr�ant un objet dans le main de type Englobante.Englobee et l'utiliser

package innerClasses;

import innerClasses.Englobante.Englobee;

public class Test {

	public static void main(String[] args) {
		Englobante englobante= new Englobante();
		System.out.println(englobante.toString());
		
		// oubien
		Englobee englobee= englobante.new Englobee();
		System.out.println(englobee.toString());
		
		// impl�mentation de l'interface I1
		new I1(){
			public void m1(){
				//Code...
			}
		}.m1();
	}

}
