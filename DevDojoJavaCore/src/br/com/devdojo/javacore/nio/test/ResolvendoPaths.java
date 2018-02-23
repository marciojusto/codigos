package br.com.devdojo.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {

	public static void main(String[] args) {
		
		Path dir = Paths.get("home\\marcio");
		Path arquivo = Paths.get("dev\\arquivo.txt");
		
		Path result = dir.resolve(arquivo); // Serve para juntar o path absoluto e o relativo.
		System.out.println(result);
		
		Path absoluto = Paths.get("/home/marcio");
		Path relativo = Paths.get("dev");
		
		Path file = Paths.get("File.txt");
		
		System.out.println("1: " + absoluto.resolve(relativo));
		System.out.println("2: " + absoluto.resolve(file));
		System.out.println("3: " + relativo.resolve(file));
		System.out.println("4: " + relativo.resolve(absoluto));
		System.out.println("5: " + file.resolve(absoluto));
		System.out.println("6: " + file.resolve(relativo));
		
	}
}
