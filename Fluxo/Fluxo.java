public class Fluxo{

	public static void main(String[] args){
	
	//switch: serve para uma avaliação = compara o valor com os casos.
		char sexo = 'M';
		
		switch(sexo){
			case 'M': //
				System.out.println("Male");
				break;
			case 'F':
				System.out.println("Female");
				break;
			default:
				System.out.println("Outro");
		}
	
	
	//if, else if, else
		int nota = 3;
		if(nota >=7){
			System.out.println("Passou");
		}else{
			System.out.println("Reprovou");
			if(nota>= 6){
				System.out.println("mas pode fazer a recuperacao");
			}
		
		}
		
	
		int idade = 31;
		if(idade <=11){
			System.out.println("Crianca");
		}else if(idade>11&& idade<=18){
			System.out.println("Adolescente");
		}else if(idade>18&& idade<=60){
			System.out.println("Adulto");
		}else{
			System.out.println("Melhor idade");
		}
		
		
		int numero = 11;
		if((numero % 2) == 0) {  //verifica se o numero é par
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
	}

}



