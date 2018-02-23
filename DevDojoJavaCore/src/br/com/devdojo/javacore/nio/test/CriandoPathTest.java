package br.com.devdojo.javacore.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {

	public static void main(String[] args) {
		
		//A classe PATH veio para substituir a classe FILE.
		Path p1 = Paths.get("C:\\Users\\marjusto\\Desenvolvimento\\Projetos\\workspace\\DevDojo\\DevDojoJavaCore\\folder\\Arquivo.txt");
		Path p2 = Paths.get("C:\\Users\\marjusto\\Desenvolvimento\\Projetos\\workspace\\DevDojo\\DevDojoJavaCore\\folder\\", "Arquivo.txt");
		Path p3 = Paths.get("C:", "\\Users\\marjusto\\Desenvolvimento\\Projetos\\workspace\\DevDojo\\DevDojoJavaCore\\folder\\", "Arquivo.txt");
		Path p4 = Paths.get("C:", "Users", "marjusto", "Desenvolvimento", "Projetos", "workspace", "DevDojo", "DevDojoJavaCore", "folder", "Arquivo.txt");
		
		System.out.println(p4.toAbsolutePath());
		
		File file = p4.toFile();
		Path path = file.toPath();
		
		Path path1 = Paths.get("pasta");
		Path path2 = Paths.get("pasta\\subpasta\\sub_subpasta");
		Path arquivo = Paths.get("pasta\\subpasta\\sub_subpasta\\file.txt");
		
		try {
			//if(Files.notExists(path1)) {
				//Files.createDirectory(path1);
			//}	
			if(Files.notExists(path2)) {	
				Files.createDirectories(path2.getParent()); //.getParent() cria a estrutura de diretório ignorando o nome do arquivo caso o mesmo esteja descrito ao final.
			}
			if(Files.notExists(arquivo)) {
				Files.createFile(arquivo);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Path source = Paths.get("folderRenamed\\arquivo.txt");
		Path target = Paths.get(path2.toString() + "\\arquivoCopiado.txt");
		
		try {
			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING); //StandardCopyOption.REPLACE_EXISTING - parâmetro utilizado caso arquivo de mesmo nome já exista na pasta.
			Files.deleteIfExists(target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
