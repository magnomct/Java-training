package poo;

public class Raiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Como o método raiz(int x) que criamos na classe OperacaoMatematica é estático (static), podemos chama-lo sem criar um objeto do tipo OperacaoMatematica...  
		  
        int x = 27;  
        int raiz = OperacaoMatematica.raiz(x);  
        System.out.println(raiz);

	}

}
