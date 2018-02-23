package br.com.devdojo.javacore.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		
		File file = new File("Arquivo.txt");
		
		try (
				BufferedWriter bWriter = new BufferedWriter(new FileWriter(file));
				BufferedReader bReader = new BufferedReader(new FileReader(file));
			) {
			
			bWriter.write("Escrevendo uma mensagem no arquivo");
			bWriter.newLine();
			bWriter.write("E pulando uma linha!");
			bWriter.flush();
			bWriter.close();
			
			String s;
			while((s = bReader.readLine()) != null) {
				System.out.println(s);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		/*try {
			
			FileWriter fWriter = new FileWriter(file); // new FileWriter(file, true) - Faz um append de conteúdo no arquivo
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			
			bWriter.write("Escrevendo uma mensagem no arquivo");
			bWriter.newLine();
			bWriter.write("E pulando uma linha!");
			bWriter.flush();
			bWriter.close();
			
			FileReader fr = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fr);
			String s = null;
			while((s = bReader.readLine()) != null) {
				System.out.println(s);
			}
			bReader.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}
