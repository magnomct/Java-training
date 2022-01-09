//Java aula 22

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList{

	public static void main (String[]args){
	
		ArrayList<String> cores = new ArrayList <>();
		cores.add("Branco");
		
		//Equivalente no Array trad. cores[0] = Branco
		
		System.out.println(cores.toString()); //toString retorna uma representação em texto dos valores do array
	
	
	/*aula 21
	
	
	String[]faces = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
	String[]nipes = {"Espadas","Paus","Copas","Ouros"};
	
	Random r = new Random();
	
	int indiceFace = r.nextInt(faces.length);
	String face = faces[indiceFace];
	
	int indiceNipe = r.nextInt(nipes.length);
	String nipe = nipes[indiceNipe];
	
	String carta = face + "\n" + nipe;
	System.out.println(carta);
	*/
	}

}