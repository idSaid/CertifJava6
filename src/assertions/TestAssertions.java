package assertions;

import java.util.Scanner;

/*
 * pour activer les assertions :
 * Run -> Run Configurations -> TestAssertion -> Arguments -> VMArguments -ea
 */

public class TestAssertions {
	

	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		System.out.println("saisir l'age: ");
		int age=in.nextInt();
		assert age>18 : "Age incorrect";
		System.out.println("admis");
	}

}
