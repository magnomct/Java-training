/**
 *Apresentar conceitos de Variável
 *@author Carlos Magno
 */

public class Variavel {
	
	public static void main (String[] args) {
	
		String primeiroNome = "Carlos";
		
		Integer idade = new Integer(26);
		int indade = 26;
		boolean casado = false;
		Double preco = new Double("12.45");
		double d = preco.doubleValue();//converte de volta pra double
		int i = preco.intValue();
		byte b = preco.byteValue();
		Boolean casado1 = new Boolean("true");
		
		//CONVERSaO ESTaTICA
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("2.14F");
		int i2 = Integer.valueOf("101011",2);
		System.out.println(i2);
		
		
		//System.out.println(primeiroNome);
		
		//Variável primitiva
		int x = 7;
		
		//Variável de referência
		String y = "XTI";
		y = "xti.com.br";
		y = null;
		
		int populacaoBrasileira = 203429773;
		final double PI = 3.14159265358979323846; //valor com modidicador "final" não pode ser alterado
		final char SEXO_MASCULINO = 'M';
		final char SEXO_FEMININO = 'F';
		
		System.out.println(PI);
		
		
		
	
	}
}