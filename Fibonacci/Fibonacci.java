/* DESAFIO : Fibonacci
 * Começa-se a série com 0 (zero) e 1 (um)
 * Obtém-se o próximo número de Fibonacci
 * somando-se os dois anteriores e, assim,
 * sucessiva e infinitamente
 */

public class Fibonacci{
	
	public static void main (String [] args){
	
	long a = 0;
	long b = 1;
	long auxiliar = 0;
	
	int i;
	int n = 50;
	
	for(i=0;i<n;i++){
	
	auxiliar=a+b;
	a=b;
	b=auxiliar;
	System.out.println(auxiliar);
		}
	}
}

/* resposta do autor...
int anterior = 0;
int proximo = 1;
System.out.println(anterior);
System.out.println(proximo);
proximo = proximo + anterior;
*/