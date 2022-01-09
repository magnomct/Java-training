import java.util.Arrays;

class ArraySimples{

	public static void main(String[] args){
	
	//tipo[] nome = {Elemento0, 1, 2, 3}
	String[] paises = {"Brasil","Russia","India","China"};
	
	System.out.println(paises[0]);
	//paises[0] = "BRAZIL";
	//System.out.println(paises[0]);
	
	//mostra a quantidade de posi��es mo array
	//System.out.println(paises.length);
	
	//apresenta os elementos do tipo string do array
	System.out.println(Arrays.toString(paises));
		
	//procura a posic�o buscada
	int posicao = Arrays.binarySearch(paises,"Russia");
	System.out.println(posicao);
	
	//Orden��o
	Arrays.sort(paises, 0, paises.length);
	System.out.println(Arrays.toString(paises));
	
	//podemos acessar os metodos dentro dos objetos do array
	
	Double[] valores = {12.35,3456.3456};
	System.out.println(valores[0].doubleValue());
	
	//outro tipo de inicializa��o
	
	int[] impares = new int[5];
	impares[0] = 1;
	impares[1] = 3;
	impares[2] = 5;
	impares[3] = 7;
	impares[4] = 9;
	
	//===========
	// - Aula 21
	//===========
	
	String[] uma = {"Ricardo","Sandra"};
	//para acessar 1 dimens�o
	//uma[0]
	//cada colchetes � um array
	String[][] duas = 
	{
		{"Ricardo","M","DF"},{"Sandra","F","MG"}
	};
	//Primeiro colchete = 1 array
	//Para acessar Ricardo
	
	System.out.println(duas[0][0]);
	//Para acessar Sandra
	System.out.println(duas[1][0]);
	System.out.println(duas[0].length);
	
	//Mudar o valor no array
	duas[1][0] = "SANDRA";
	System.out.println(duas[1][0]);
	
	//Array com n dimens�es
	int[][][][] n;
	d[0][1][2][3];
	//Obs.: Arrays com 3 ou mais dimens�es s� s�o usados em calc cientificos
	
	
	}
}