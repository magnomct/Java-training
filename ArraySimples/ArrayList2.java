//Java aula 22

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2{

	public static void main (String[]args){
	
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("Branco");	
		cores.add(0, "Vermelho");//define o indice antes da virgula
		cores.add("Amarelo");
		cores.add("Azul");
		System.out.println(cores.toString()); // mostra os itens do array	
		System.out.println(cores.size()); //mostra o tamanho do array
		System.out.println("Elemento 2=" + cores.get(2));//recupera um elemento 
		System.out.println("Indice Branco=" + cores.indexOf("Branco"));//mostra o indice do elemento tal
		
		cores.remove("Branco"); //método que remove um item do array
		
		System.out.println("Tem amarelo? " +cores.contains("Amarelo"));
		System.out.println("Tem Cinza? " +cores.contains("Cinza"));
	}

}