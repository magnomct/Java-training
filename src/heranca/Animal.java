package heranca;

public abstract class Animal {
	
	protected int serial;
	double peso;
	String comida;
	
		public Animal(double peso, String comida){
		this.peso = peso;
		this.comida = comida;
	}
	
	final void dormir(){System.out.println("Dormiu");}
	
	//metodo sem corpo só existe em classe abstratas
	// e podem ser vazios
	
	abstract void fazerBarulho();

	
}
