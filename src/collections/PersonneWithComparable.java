package collections;

public class PersonneWithComparable implements Comparable<PersonneWithComparable>{

	private String nom;
	private String prenom;
	
	public PersonneWithComparable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonneWithComparable(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Personne ["+nom+", "+prenom+"]";
	}
	
	@Override
	public int compareTo(PersonneWithComparable personne) {
		if(this.nom.compareToIgnoreCase(personne.nom)<0) return -1;
		else if(this.nom.compareToIgnoreCase(personne.nom)>0) return 1;
		else return 0;
	}
	
	
	
}
