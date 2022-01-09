package javaa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import poo.Conta;

public class Serializa2 {
	
	public void armazenarContas(ArrayList<Conta> contas) throws IOException {
		
		try (FileOutputStream fos = new FileOutputStream("C:/JAVA/files/contas.ser")){
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(contas);
			}
		}
				
		/*try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)){
			for (Conta conta : contas) {
				writer.write(conta.getCliente()+";"+conta.getSaldo()+"\n");
			}
		}*/
	}
	
	public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException{
		try(FileInputStream fis = new FileInputStream("C:/JAVA/files/contas.ser")){
		   try(ObjectInputStream ois = new ObjectInputStream(fis)){
		   return (ArrayList<Conta>) ois.readObject();
		   }
		}
		
		/*ArrayList<Conta> contas = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)){
			String line = null;
			while((line = reader.readLine()) != null){
				String[] t = line.split(";");
				//System.out.println(t[0]+t[1]);
				Conta conta = new Conta(t[0],Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
		return contas;*/
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Ricardo", 12000.23));
		contas.add(new Conta("Lawrence", 11050.32));
		contas.add(new Conta("Sandro", 18000.21));
		contas.add(new Conta("Beatriz", 23200.09));
		
		Serializa2 operacao = new Serializa2();
		operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibeSaldo();
			
		}
	}	
}	
		
		
		
				
		

