package javaa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException{
		
		// O arquivo não precisa existir para fazer a chamada
		// Introduzida no Java 7
		//no windows o caminho é
		Path path = Paths.get("C:/JAVA/files/texto.txt");
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getFileName());
		
		//no linux o caminho não tem a letra do disco
		//Path path = Paths.get("/JAVA/files/texto.xri");
				
		/* CRIAÇÃO DE DIRETÓRIOS */
		
		Files.createDirectories(path.getParent());
		
		/* ESCREVER E LER ARQUIVOS */
		
		byte[] bytes = "Meu texto".getBytes();
		Files.write(path, bytes);//cria, limpa, escreve (bom para arquivos pequenos)
	
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));
		
	}

}
