package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero2 {

	public static void Dividir(Scanner s) throws InputMismatchException, ArithmeticException 
	{
		
		System.out.println("Numero: ");
		int a = s.nextInt();
		System.out.println("Divisor: ");
		int b = s.nextInt();
		
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		//bloco protegido com try catch
		
		boolean continua = true;
		do {
			
			try{
				
				Dividir(s);
				continua = false;
				
				}
				
			//multi caths a partir da versão 7 
			catch(InputMismatchException | ArithmeticException e1){
					System.err.println("Numero Inválido");
					//printa os erros na tela
					e1.printStackTrace();
					
					s.nextLine(); //descarta a entrada errada e libera novamente para o user
				}
							
			// o bloco finally sempre executa
			finally{
				System.out.println("Finally executado...");
			}
			
		} while (continua);
		
	}

}
