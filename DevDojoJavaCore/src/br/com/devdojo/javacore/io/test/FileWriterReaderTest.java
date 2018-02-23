package br.com.devdojo.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {

	public static void main(String[] args) {
		
		File file = new File("Arquivo.txt");
		
		try (
				FileWriter fwriter = new FileWriter(file);
				FileReader fr = new FileReader(file);
			) {
			
			fwriter.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha! 3");
			fwriter.flush();
			fwriter.close();
			
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("tamanho " + size);
			for (char c : in) {
				System.out.print(c);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		/*try {
			
			FileWriter fwriter = new FileWriter(file); // new FileWriter(file, true) - Faz um append de conteúdo no arquivo
			fwriter.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha! 3");
			fwriter.flush();
			fwriter.close();
			
			FileReader fr = new FileReader(file);
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("tamanho " + size);
			for (char c : in) {
				System.out.print(c);
			}
			fr.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}
