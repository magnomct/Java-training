package poo;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inicialização com costrutor padrão
		
		Carro ferrari = new Carro(); // Construtor igual o nome da classe e começa com letra maiusc.
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12; //adiciona o motor 
		
		//Inicialização com o cosntrutor direto
		
		Carro koenigsegg = new Carro("Koenigsegg CCXR",430, 3.1);
		Motor v8 = new Motor("V8",1018);
		koenigsegg.motor = v8;
		
		//Teste com o nova chamada de construtor
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
		
		System.out.println(koenigsegg.motor.potencia);
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.potencia);
		
	}

}
