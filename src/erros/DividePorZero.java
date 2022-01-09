package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		//bloco protegido com try catch
		
		boolean continua = true;
		do {
			
			try{
				
				System.out.println("Numero: ");
				int a = s.nextInt();
				System.out.println("Divisor: ");
				int b = s.nextInt();
				
				//InputMismatchException XTI
				//ArithmeticException 0
				
				System.out.println(a / b);
				continua = false;
				}
				catch(InputMismatchException e1){
					System.err.println("Numeros devem ser inteiros");
					s.nextLine(); //descarta a entrada errada e libera novamente para o user
				}
				catch(ArithmeticException e2){
					System.err.println("Divisor deve ser diferente de zero");
					s.nextLine();
				}
			
			// o bloco finally sempre executa
			finally{
				System.out.println("Finally executado...");
			}
			
		} while (continua);
		
		
		
		
	}

}
