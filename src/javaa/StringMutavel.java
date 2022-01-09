package javaa;

public class StringMutavel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Métodos sincronizados - com muitas threads
		StringBuffer s0 = new StringBuffer();
		
		//Mais simples
		StringBuilder s1 = new StringBuilder("Java");

		s1.toString();
		s1.length();
		System.out.println(s1.length());
		//Informa a capacidade de armazenamento sem alocar mais memória
		s1.capacity();
		System.out.println(s1.capacity());
		
		System.out.println(s1);
		//s1.reverse();
		System.out.println(s1);
		
		//Método mais usado
		
		s1.append(" Trabalhando ");
		char[] c = {'c','o','m'};
		s1.append(c).append(" Textos");
		System.out.println(s1);
		
		//errado
		String s = "Oi" + " como " + "vai você?";
		
		//certo usando a string builder para concatenar
		String sb = new StringBuilder("Oi").append(" como ").append("vai você?").toString();
		System.out.println(s);
		System.out.println(sb);
		
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		System.out.println(url);
		
	}

}
