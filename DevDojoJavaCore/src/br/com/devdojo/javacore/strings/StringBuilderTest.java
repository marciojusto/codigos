package br.com.devdojo.javacore.strings;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String s = "Uma frase comum";
		
		StringBuilder builder = new StringBuilder(16);
		builder.append("0123456789");
		//System.out.println(builder.delete(0, 2));
		System.out.println(builder.insert(2, "###"));
	}
}
