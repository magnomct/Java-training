package heranca;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal generico = new Animal(0,null);
		
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.dormir();
		
		
		//instanceof avalia se o objeto é de um tipo 
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
		
		//metodo equal compara dois objetos exemp.: o corrente com a carijo
		toto.equals(carijo);
		//metodo hashcode - gera um numero serial, normalmente pra coleções como o arraylist
		toto.hashCode();
		//retorna o tipo da classe desse objeto
		toto.getClass();
		//retorna a representacao em string do objeto
		toto.toString();
		
		toto.fazerBarulho();
		carijo.fazerBarulho();
		//generico.fazerBarulho();
	}

}
