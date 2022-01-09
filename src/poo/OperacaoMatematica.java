package poo;

public class OperacaoMatematica {
	
	 public static int raiz(int x) //Método estático que retorna um inteiro. Recebe o parametro x (Do tipo int); Será extraido a raiz quadrada de x;  
     {  
           int n = 0;  
           int i = 0;   
 
           while(i<=x) //Enquanto i < x ....  
           {  
                 x -= i; //Atualiza o valor de x;  x=x-i ;  
                 i += 2; //Atualiza o valor de i;  i=i+2. Deste modo, i sempre será ímpar;  
                 n++; //Soma mais 1 ao n;  
           }  
           return n; //Finalmente, depois que todo o while() foi execultado, retorna o valor de n;  
 
           /*Você pode verificar se o valor retornado n é a raíz real do parâmetro x passado. Antes do while() crie um int j = x; 
           Aqui no final faça um if(); ex.: 
           if(n*n==j) // n é a raíz real de j (j vale x antes do while) 
           { 
                 blá, blá, blá! 
           } 
           else // n não é a raíz real de j (j vale x antes do while) 
           { 
                 blá, blá, blá! 
           } 
           */  
     }  

}
