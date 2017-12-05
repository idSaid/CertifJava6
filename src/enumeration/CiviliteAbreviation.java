package enumeration;

public enum CiviliteAbreviation {
	
	Madame("Mme"),Mademoiselle("Mlle"),Monsieur("Mr");
	private String abreviation;
	
	private CiviliteAbreviation(String abreviation) {
		this.abreviation=abreviation;
	}

	public String getAbreviation() {
		return abreviation;
	}
	
	
}
