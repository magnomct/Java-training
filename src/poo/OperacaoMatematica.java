package poo;

public class OperacaoMatematica {
	
	 public static int raiz(int x) //M�todo est�tico que retorna um inteiro. Recebe o parametro x (Do tipo int); Ser� extraido a raiz quadrada de x;  
     {  
           int n = 0;  
           int i = 0;   
 
           while(i<=x) //Enquanto i < x ....  
           {  
                 x -= i; //Atualiza o valor de x;  x=x-i ;  
                 i += 2; //Atualiza o valor de i;  i=i+2. Deste modo, i sempre ser� �mpar;  
                 n++; //Soma mais 1 ao n;  
           }  
           return n; //Finalmente, depois que todo o while() foi execultado, retorna o valor de n;  
 
           /*Voc� pode verificar se o valor retornado n � a ra�z real do par�metro x passado. Antes do while() crie um int j = x; 
           Aqui no final fa�a um if(); ex.: 
           if(n*n==j) // n � a ra�z real de j (j vale x antes do while) 
           { 
                 bl�, bl�, bl�! 
           } 
           else // n n�o � a ra�z real de j (j vale x antes do while) 
           { 
                 bl�, bl�, bl�! 
           } 
           */  
     }  

}
