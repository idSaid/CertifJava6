package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FluxEntreeTexte {
	
	private static BufferedReader entree;
	private static BufferedReader entree2;

	public static void main(String[] args) throws IOException {
		
		// BufferedReader + File Reader // peut lever des exception d'encodage
		entree = new BufferedReader(new FileReader("hello.txt"));
		String chaine;
		while ((chaine=entree.readLine())!=null) {
			System.out.println("1 :"+chaine);		
		}		
		entree.close();
		
		// BufferedReader + InputStream // permet de fixer un encodage 
		entree2 = new BufferedReader(new InputStreamReader(new FileInputStream(new File("hello.txt")),"UTF-8"));
		chaine="";
		while ((chaine=entree2.readLine())!=null) {
			System.out.println("2 :"+chaine);		
		}		
		entree2.close();
	}

}
