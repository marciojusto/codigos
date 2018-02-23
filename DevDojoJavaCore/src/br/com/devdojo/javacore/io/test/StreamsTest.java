package br.com.devdojo.javacore.io.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsTest {

	public static void main(String[] args) {
		leitorTunado();
	}
	
	private static void gravador() {
		
		byte[] dados = {65, 66, 67, 68, 69, 70};
		try (FileOutputStream gravador = new FileOutputStream("pasta/stream.txt")) {
			
			gravador.write(dados);
			System.out.println("Dados gravados com sucesso!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void gravadorTunado() {
		byte[] dados = {65, 66, 67, 68, 69, 70};
		try (BufferedOutputStream gravadorBuffered = new BufferedOutputStream(new FileOutputStream("pasta/stream.txt"))) {
			
			gravadorBuffered.write(dados);
			gravadorBuffered.flush();
			System.out.println("Dados gravados com sucesso!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void leitor() {
		try (FileInputStream leitor = new FileInputStream("pasta/stream.txt")) {
			int leitura;
			while ((leitura = leitor.read()) != -1) {
				byte b = (byte) leitura;
				System.out.println(" "+b);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void leitorTunado() {
		try (BufferedInputStream leitorBuffered = new BufferedInputStream(new FileInputStream("pasta/stream.txt"))) {
			int leitura;
			while ((leitura = leitorBuffered.read()) != -1) {
				byte b = (byte) leitura;
				System.out.println(" "+b);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
