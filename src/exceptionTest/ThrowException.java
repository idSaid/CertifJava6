package exceptionTest;

import java.io.IOException;

public class ThrowException {

	public static class A{
		public void process() throws IOException{
			System.out.println("A,");
		}
	}
	public static class B extends A{
		public void process() throws IOException{
			super.process();
			System.out.println("B,");
			throw new IOException(); // on déclanche une IOException
		}
	}
	
	// main est une classe statique => les autres classes doivent être statiques
	// oubien declarer un objet de type ThrowException et utiliser objet.new b().process();
	public static void main(String[] args) {
		try {
			new B().process();
		} catch (IOException e) {
			System.out.println("Exception");
		}
	}
	
}
