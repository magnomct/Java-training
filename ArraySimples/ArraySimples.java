import java.util.Arrays;

class ArraySimples{

	public static void main(String[] args){
	
	//tipo[] nome = {Elemento0, 1, 2, 3}
	String[] paises = {"Brasil","Russia","India","China"};
	
	System.out.println(paises[0]);
	//paises[0] = "BRAZIL";
	//System.out.println(paises[0]);
	
	//mostra a quantidade de posições mo array
	//System.out.println(paises.length);
	
	//apresenta os elementos do tipo string do array
	System.out.println(Arrays.toString(paises));
		
	//procura a posicão buscada
	int posicao = Arrays.binarySearch(paises,"Russia");
	System.out.println(posicao);
	
	//Ordenção
	Arrays.sort(paises, 0, paises.length);
	System.out.println(Arrays.toString(paises));
	
	//podemos acessar os metodos dentro dos objetos do array
	
	Double[] valores = {12.35,3456.3456};
	System.out.println(valores[0].doubleValue());
	
	//outro tipo de inicialização
	
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
	//para acessar 1 dimensão
	//uma[0]
	//cada colchetes é um array
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
	
	//Array com n dimensões
	int[][][][] n;
	d[0][1][2][3];
	//Obs.: Arrays com 3 ou mais dimensões só são usados em calc cientificos
	
	
	}
}