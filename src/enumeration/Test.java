package enumeration;

public class Test {

	public static void main(String[] args) {

		Personne p = new Personne("aaaa", Civilite.Mr, CiviliteAbreviation.Monsieur);
		
		System.out.println(p.civiliteAbreviation+" "+p.civilite);
		
		switch (p.civilite) {
		case Mr:
			System.out.println("switch valable pour les enums");
			break;

		default:
			break;
		}
	}

}
