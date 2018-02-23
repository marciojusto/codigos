package br.com.devdojo.javacore.io.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoTest {

	public static void main(String[] args) {
		
		Path dirZip = Paths.get("pasta/subpasta");
		Path dirFiles = Paths.get("pasta/subpasta/sub_subpasta");
		Path zipFile = dirZip.resolve("arquivo.zip");
		
		try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
				DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
			
			for(Path path : stream) {
				zip.putNextEntry(new ZipEntry(path.getFileName().toString()));
				BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path.toFile()));
				byte[] buff = new byte[2048];
				int byteRead;
				while ((byteRead = bufferedInputStream.read(buff)) > 0) {
					zip.write(buff, 0, byteRead);
				}
				zip.flush();
				zip.closeEntry();
				bufferedInputStream.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
