package br.com.devdojo.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		
		File file = new File("Arquivo.txt");
		try {
			
			System.out.println("Arquivo criado? " + file.createNewFile());
			System.out.println("Arquivo possui permiss�o de leitura? " + file.canRead());
			System.out.println("Path do arquivo: " + file.getPath()); //Apenas o path utilizado no construtor do file
			System.out.println("Path absoluto: " + file.getAbsolutePath());
			System.out.println("� um diret�rio: " + file.isDirectory());
			System.out.println("Arquivo oculto: " + file.isHidden());
			System.out.println("Ultima  modifica��o: " + new Date(file.lastModified()));
			
			boolean exists = file.exists();
			if(exists) {
				System.out.println("Arquivo deletado? " + file.delete());
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
