package exceptionTest;

public class StackOverFlowGenere {

	public static void main(String[] args) {
		while(true){
			System.out.print("."); // ne genere pas de stackoverflow exception car il ne crée pas de vaiables
		}

	}

}
