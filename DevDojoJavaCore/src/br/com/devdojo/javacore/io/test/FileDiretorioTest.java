package br.com.devdojo.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {

	public static void main(String[] args) throws IOException {
		
		File diretorio = new File("folder");
		boolean diretorioCriado = diretorio.mkdir();
		System.out.println("Diretório criado? " + diretorioCriado);
		
		File file = new File(diretorio, "Arquivo.txt");
		boolean arquivoCriado = file.createNewFile();
		System.out.println("Arquivo criado? " + arquivoCriado);
		
		File arquivoNovoNome = new File(diretorio, "Arquivo_Renomeado.txt");
		boolean renamed = file.renameTo(arquivoNovoNome);
		System.out.println("Arquivo renomeado? " + renamed);
		
		File diretorioRenomeado = new File("folderRenamed");
		boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
		System.out.println("Diretório renomeado? " + diretorioRenamed);
		
		buscarArquivos();
	}
	
	public static void buscarArquivos() {
		File file = new File("folderRenamed");
		for (String arquivo : file.list()) {
			System.out.println(arquivo);
		}
	}
}
