package javaa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/* CREATE */
		
		Path path = Paths.get("C:/JAVA/files/texto.txt");
		Files.deleteIfExists(path);
		Files.createFile(path);//CRIA UM ARQUIVO EM BRANCO
		Files.write(path, "Meu Texto".getBytes());
		
		/* COPY */
		Path copia = Paths.get("C:/JAVA/files/copia.txt");
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
		
		/* MOVE */
		Path mover = Paths.get("C:/JAVA/files/move/fonte.txt");
		Files.createDirectories(mover.getParent());
		Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);
				
		//Path path = Paths.get("C:/JAVA/files/texto.txt");
		
		System.out.println(Files.exists(path));
		System.out.println(Files.isDirectory(path));
		System.out.println(Files.isRegularFile(path));
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isExecutable(path));
		System.out.println(Files.size(path));
		System.out.println(Files.isRegularFile(path));
		System.out.println(Files.getLastModifiedTime(path));
		System.out.println(Files.probeContentType(path));
		
		/* DELETE */
		
		//Files.delete(path);
		//Files.deleteIfExists(path); //só deleta se existir
		
	}

}
