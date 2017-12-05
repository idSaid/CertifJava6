package io;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		//File dir= new File("dir");
		//dir.mkdir();
		File dir= new File("dir2");
		File f= new File(dir,"fichier.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
