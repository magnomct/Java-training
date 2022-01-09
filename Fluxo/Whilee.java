import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Whilee{

	public static void main(String[] args){
	
	int i = 0;
	//cuidado com o loop
	while(i < 2){// 0 ou n vezes
		System.out.println(i);
		i++;
		
	//se a condição for falsa o bloco é ignorado
	
	//já no do while - executa pelo menos uma vez a instrução
	
	do{// 1 vez ou n vezes
		System.out.println(i);
		i++;
	} while(i<2);
		
		/* Equivale a
		for(int i=0;i<2;i++){
			System.out.println(i);
		}
		*/
	}
	
	}
}