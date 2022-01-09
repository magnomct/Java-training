package poo;

public class Galinha {
	
	public static int ovosDaGranja;//variavel global "static" pertence a classe não aos objetos
		
	public int ovos;//total de ovos do objeto galinha
	
	public Galinha botar(){
		this.ovos++;
		Galinha.ovosDaGranja++; //para chamar uma var. static nomeDaClasse.variavel
		return this;
		} 
	
	public static double mediaDeOvos(int galinhas){
		return Galinha.ovosDaGranja / galinhas;
		
	}
}
