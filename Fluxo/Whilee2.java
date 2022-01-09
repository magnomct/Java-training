import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Whilee2{

	public static void main(String[] args){
	
	ArrayList<String> produtos = new ArrayList<String>();
	Scanner s = new Scanner(System.in);
	System.out.println("Liste seus produtos : Para sair digite FIM");
	String produto;
	//s.nextLine();//coleta para a lista com o método scanner.nextline
	while(!"FIM".equals(produto = s.nextLine())){
		produtos.add(produto);
	}
	System.out.println(produtos.toString());
	}
}