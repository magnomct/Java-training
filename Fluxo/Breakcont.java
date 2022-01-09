public class Breakcont {

	public static void main(String[] args){
	
		while(true){
			System.out.println("Entrou");
			break; //paralisa a execução de um looping inteiro
		}
		
		for(int i=0; i<10; i++){
			if(i == 5){
				continue; //break para a execução; continue-continua no próximo
			}
			System.out.println(i);
			}
		
		um:// rótulo - nome: controla o pedaço de fluxo
		for() {
			dois:
			for(int i=0; i<10; i++){
			if(i == 5){
				continue; //break para a execução; continue-continua no próximo
			}
			System.out.println(i);
			}
		}
		
		
	}

}