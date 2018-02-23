package br.com.devdojo.javacore.expressoesregulares.test;

public class TokenTest {

	public static void main(String[] args) {
		
		String str = "William, Paulo, Joana, Camila, Anna, John, Matheus";
		String[] tokens = str.split(",");
		for (String string : tokens) {
			System.out.println(string.trim());
		}
	}
}
