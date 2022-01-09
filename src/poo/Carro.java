package poo;

public class Carro {

	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;
	
	//caso não declare o construtor o defaut criado pelo java é isso:
	//O construtor serve para inicializar o objeto
	
	public Carro(){
		
	}
	
	//construtor iniciado diretamente na classe
	
	/*public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		
	}*/
	
	//Usando um construtor para chamar outro
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem){
		this(modelo, velocidadeMaxima, segundosZeroACem, null);
		
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
		
	}
}
