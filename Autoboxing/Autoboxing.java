public class Autoboxing {

	public static void main(String[] args){
	
		/*exemplo antes da versão 5
		
		Integer x = new Integer(555); //tipo primitivo encapsulado na classe whapper
		int a = x.intValue();//desempacotar
		a++;//Incrementa
		x = new Integer (a);//re-empacotar
		System.out.println(x.intValue());
		
		*/
		
		//Depois da versão 5 do java podemos usar algo mais simples:
		
		Integer x = 555;
		x++;//desempacota, incrementa, reempacota
		System.out.println(x);
	}
}