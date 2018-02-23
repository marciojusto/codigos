package br.com.devdojo.javacore.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTest {

	public static void main(String[] args) throws IOException {
		
		Date primeiroDeDezembro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
		File file = new File("folderRenamed\\Arquivo_Renomeado.txt");
		file.createNewFile();
		file.setLastModified(primeiroDeDezembro.getTime());
		System.out.println(file.lastModified());
		file.delete();
		
		Path path = Paths.get("folderRenamed\\arquivo_path.txt");
		Files.createFile(path);
		FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
		Files.setLastModifiedTime(path, fileTime);
		System.out.println(Files.getLastModifiedTime(path));
		Files.deleteIfExists(path);
		
		path = Paths.get("src\\br\\com\\devdojo\\javacore\\strings\\StringBuilderTest.java");
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isWritable(path));
		System.out.println(Files.isExecutable(path));
		
		//BasicFileAttributes [todos os sistemas], PosixFileAttributes [sistemas baseados em UNIX], DosFileAttributes [Windows] (apenas leitura)
		
		BasicFileAttributes atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println("creationTime: " + atributosBasicos.creationTime());
		System.out.println("lastAccessTime: " + atributosBasicos.lastAccessTime());
		System.out.println("lastModifiedTime: " + atributosBasicos.lastModifiedTime());
		System.out.println("isDirectory:  " + atributosBasicos.isDirectory());
		System.out.println("isSymbolicLink: " + atributosBasicos.isSymbolicLink());
		System.out.println("isRegularFile: " + atributosBasicos.isRegularFile());
		
		//BasicFileAttributeView, PosixFileAttributeView, DosFileAttributeView, FileOwnerAttributeView [alterações relacionadas ao dono do arquivo], AclFileAttributeView [permissões avançadas] (realiza alteração)
		FileTime lastModifiedTime = atributosBasicos.lastModifiedTime();
		FileTime created = atributosBasicos.creationTime();
		FileTime lastAccessTime = FileTime.fromMillis(System.currentTimeMillis());
		BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		basicView.setTimes(lastModifiedTime, lastAccessTime, created);
		atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
		
		System.out.println("create: " + atributosBasicos.creationTime());
		System.out.println("lastAccess: " + atributosBasicos.lastAccessTime());
		System.out.println("lastModified: " + atributosBasicos.lastModifiedTime());
	}
}
