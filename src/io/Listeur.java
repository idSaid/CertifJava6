package io;

import java.io.File;

public class Listeur {

	public static void main(String[] args) {
		litrep(new File("."));	//repertoir courant => racine du projet
	}

	private static void litrep(File rep) {
		//lister toute l'arborescence
		if(rep.isDirectory()){
			for (File f : rep.listFiles()) {
				if(f.isDirectory()){
					litrep(f);
				}
				else{
					System.out.println(f.getName());
					// en commentaire liste un rep
//					String t[]=f.list();	//liste des fichiers et dossier du repertoir 'ls sous linux'
//					for (String string : t) {				
//					System.out.println(string);
//					}
				}
			} 
			
			
		}
	}

}
