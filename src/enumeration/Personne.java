package enumeration;

public class Personne {
	String nom;
	Civilite civilite;
	String civiliteAbreviation;
	
	public Personne(String nom, Civilite civilite, CiviliteAbreviation civiliteAbreviation) {
		super();
		this.nom = nom;
		this.civilite = civilite;
		this.civiliteAbreviation = civiliteAbreviation.getAbreviation();
	}
	
	
}
