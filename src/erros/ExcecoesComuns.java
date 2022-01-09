package erros;

import heranca.Animal;
import heranca.Cachorro;
import poo.Galinha;

@SuppressWarnings("unused")
public class ExcecoesComuns {

	static int[] arrayNull = new int[0];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NullPointerexception
		//System.out.println(arrayNull.length);
		
		//aritmetic exception
		//int x = 5 / 0;
		
		//ArrayIndexOutOfBoundsException
		//tentar acessar uma posição q não existe no array
		//System.out.println(arrayNull[1]);
		
		//Class cast exception
		//tentar converter uma classe
		//Galinha a = new Galinha();
		//Cachorro c = (Cachorro) a;
		
		//NumberFormatException
		//não faz o parse de string texto para numero
		//int i = Integer.parseInt("x");
		
	}

}
