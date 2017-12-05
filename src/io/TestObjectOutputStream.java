package io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestObjectOutputStream implements Serializable {

	int arg1;
	String arg2;
	
	public TestObjectOutputStream() {
		arg1=1;
		arg2="test";
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
			ObjectOutputStream Oos= new ObjectOutputStream(new FileOutputStream(new File("objects.txt")));
			Oos.writeObject(new TestObjectOutputStream());
			
			ObjectInputStream Ois= new ObjectInputStream(new FileInputStream(new File("objects.txt")));
			System.out.println(Ois.readObject());
			

	}

}
