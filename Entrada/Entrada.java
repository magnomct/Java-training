import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args){
		//Recupera o dado na chamada do programa
		//System.out.println(args[0]);
		
		//Interagindo com o Usuário
		/*Scanner s = new Scanner (System.in);
		System.out.println("Qual o seu nome?");
		String nome = s.nextLine();
		System.out.println("Bem vindo " + nome);*/
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		//System.out.println(nome);
		JOptionPane.showMessageDialog(null, nome);
	}
}