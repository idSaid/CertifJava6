package innerClasses;

public class Englobante {

	private String attributEnglobante = "Englobante";
	
	
	@Override
	public String toString() {
		
		return new Englobee().toString();
	}
	
	public class Englobee{
		private String attributEnglobee = "Englobee";
		
		@Override
		public String toString() {
			return Englobante.this.attributEnglobante+" "+Englobee.this.attributEnglobee; // on peut ecrire directement attributEnglobante+" "+attributEnglobee;
		}
		
	}
	
	
	
	
}
