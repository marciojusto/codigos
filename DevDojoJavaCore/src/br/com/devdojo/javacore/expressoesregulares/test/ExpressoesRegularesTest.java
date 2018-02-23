package br.com.devdojo.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		
		// \d - todos os digitos
		// \D - tudo o que nao for digito
		// \s - espacos em branco (\t \n \f \r - tambem serao encontrados)
		// \S - tudo o que nao e espaco em branco
		// \w - caracteres de palavras a-z A-Z, como tambem (digitos) e (_)
		// \W - tudo o que nao for um caracter de palavra
		// []
		// Quantificadores: 
		// ? zerou ou uma ocorrencia
		// * zero ou mais ocorrencias
		// + uma ou mais ocorrencias
		// {n,m} de n ate m
		// ( ) agrupar
		// | ou
		// $ fim de linha
		// . coringa (Ex.: 1.3 = 123, 133, 1A3, 1#3, 1 3)
		// ^ caracter de negação. Ex.: [^abc] tudo, exceto abc
		
		//String regex = "aba";
		//String regex = "[abcABC]";
		//String regex = "[a-zA-C]";
		//String regex = "[a-zA-C0-9]";
		
		//String texto = "abababa";
		//String texto = "#@hab1278abbvbgsa02121";
		//String texto = "#@hab1278 ";
		//String texto = "cafeBABE";
		
		//Localizar numeros Hexadecimais
		//String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
		//String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
		
		//String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z0-9])+(\\.([a-zA-Z])+)+";
		//String regex = "([\\w\\.])+@([a-zA-Z\\d])+(\\.([a-zA-Z])+){1,2}";
		//String texto = "fulano@hotmail.com, 102Abc@gmail.com.br.edu, #@!abrao@mail, teste@gmail.br, teste@mail";
		//System.out.println("\nEmail #@!abrao@mail é válido? " + "#@!abrao@mail".matches(regex));
		
		//String regex = "\\d{2}/\\d{2}/\\d{2,4}";
		//String texto = "05/10/2010 05/05/2015 01/05/95"; // dd/MM/yyyy

		String regex = "proj([^,])*";
		String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("Texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("Expressao: " + matcher.pattern() + "\n");
		System.out.println("Posicoes encontradas:");
		
		while(matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
		}
	}
}
