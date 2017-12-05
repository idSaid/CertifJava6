package exceptionTest;

import java.util.Scanner;

public class ExceptionTest {

	
	public static int divide(int a, int b){
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		try{
			System.out.println(divide(a,b));
		}
		catch (ArithmeticException e) {
			System.out.println("/ by zero :: reinserer a et b");
			ExceptionTest.main(args); // on relance le programme pour que l'utilisateur reinsère les valeurs de a et b
		}
	}

}
