package br.com.devdojo.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizarTest {

	public static void main(String[] args) {
		
		//Eliminar o que se tem em comum com dois Paths
		Path dir = Paths.get("/home/marcio");
		Path classe = Paths.get("/home/marcio/java/Pessoa.class");
		Path pathToClasse = dir.relativize(classe);
		System.out.println(pathToClasse);
		
		Path absoluto1 = Paths.get("/home/marcio");
		Path absoluto2 = Paths.get("/usr/local");
		Path absoluto3 = Paths.get("/home/marcio/java/Pessoa.java");
		Path relativo1 = Paths.get("temp");
		Path relativo2 = Paths.get("temp/Funcionario.java");
		
		System.out.println("1: " + absoluto1.relativize(absoluto3));
		System.out.println("2: " + absoluto3.relativize(absoluto1));
		System.out.println("3: " + absoluto1.relativize(absoluto2));
		System.out.println("3: " + relativo1.relativize(relativo2));
		//System.out.println("4: " + absoluto1.relativize(relativo1)); //Exception porque o caminho absoluto não sabe como chegar em um relativo
	}
}
