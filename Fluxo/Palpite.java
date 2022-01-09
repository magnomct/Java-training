
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *Desafio - Palpite do dado
 *Qual o Palpite
 *Qual o valor do dado?
 *o palpite está correto?
 */

public class Palpite{
	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		System.out.println("Qual o seu palpite?\n");
		
		int palpite = s.nextInt();
		
		Random n = new Random();
		int dado = n.nextInt(6)+1;//0-5 metodo que retorna 6 posições-começa no zero então +1
		
		System.out.println("Palpite = "+palpite);
		System.out.println("Dado = "+dado);
		
		if(palpite == dado){
			System.out.println("Acertou");
		}else{
			System.out.println("Errou");
		}
	
	/*Integer chute = JOptionPane.showInputDialog("Qual é o plapite do dado ?");
	int palpite = Integer.parseInteger(chute);
	dropkick murphis - I me
	String[]faces = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
	String[]nipes = {"Espadas","Paus","Copas","Ouros"};
	Random r = new Random();
	int indiceFace = r.nextInt(faces.length);
	String face = faces[indiceFace];
	int indiceNipe = r.nextInt(nipes.length);
	String nipe = nipes[indiceNipe];
	String carta = face + "\n" + nipe;
	System.out.println(carta);
	String msg = (imc >=20 && imc <=25) ? "Peso Ideal" : "Fora do peso ideal";
	msg = "IMC = " + imc + "\n" +msg;
	JOptionPane.showMessageDialog(null, msg);
	*/	
	
	}

}