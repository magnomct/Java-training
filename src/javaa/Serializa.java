package javaa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import poo.Conta;


public class Serializa {

	public static void main(String[] args) throws Exception {
		
		
		String[] nomes = {"Ricardo","Beatriz","Sandra"};
		
		Conta conta1 = new Conta("XTI", 111_222_333.444);
		
		
		/* ESCRITA DE OBJETO */
		
		//gravar o objeto
		FileOutputStream fos = new FileOutputStream("C:/JAVA/files/Texto.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(conta1);
		oos.close();
		
		/* LEITURA DE OBJETO */
		FileInputStream fis = new FileInputStream("C:/JAVA/files/Texto.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//String[] nomes1= (String[]) ois.readObject();
		Conta c1 = (Conta) ois.readObject();
		ois.close();
		
		//System.out.println(Arrays.toString(nomes));
		c1.exibeSaldo();

	}

}
