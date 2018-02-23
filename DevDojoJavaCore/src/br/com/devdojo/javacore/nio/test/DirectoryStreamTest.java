package br.com.devdojo.javacore.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {

	public static void main(String[] args) {
		
		Path dir = Paths.get("pasta");
		
		//Lista apenas o conte�do direto dentro do diret�rio 'pasta'
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			
			for(Path path : stream) {
				System.out.println(path.getFileName()); 
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
