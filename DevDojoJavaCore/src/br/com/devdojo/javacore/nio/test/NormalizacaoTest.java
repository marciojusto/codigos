package br.com.devdojo.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {

	public static void main(String[] args) {
		
		String diretorioProjeto = "javaonline\\home\\marcio\\dev";
		String arquivoTxt = "..\\..\\arquivo.txt";
		
		Path p1 = Paths.get(diretorioProjeto, arquivoTxt);
		System.out.println(p1);
		System.out.println(p1.normalize()); // Retira os ..\..\ de retorno para o diretório anterior
	}
}
