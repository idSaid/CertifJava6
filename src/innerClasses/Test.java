// on ne peut pas acceder aux methodes de la classe englobée si elle n est pas statique
// pour y acceder on utilise une méthode de l objet instentié de la classe englobé dans la classe englobante
// si la classe englobée été statique on aurai pu y acceder en créant un objet dans le main de type Englobante.Englobee et l'utiliser

package innerClasses;

import innerClasses.Englobante.Englobee;

public class Test {

	public static void main(String[] args) {
		Englobante englobante= new Englobante();
		System.out.println(englobante.toString());
		
		// oubien
		Englobee englobee= englobante.new Englobee();
		System.out.println(englobee.toString());
		
		// implémentation de l'interface I1
		new I1(){
			public void m1(){
				//Code...
			}
		}.m1();
	}

}
