package javaa;

import javax.swing.text.Position;

public class StringOperacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Write Once";
		String s2 = s1 + " Run AnyWhere";
		String s3 = new String("Java Virtual Machine");
		char[] array = {'J','a','v','a'};
		String s4 = new String(array);
		
		//OPERAÇÕES
		//retorna o numero de caracteres
		int tamanho = s1.length();
		s1.charAt(0);
		char letra = s1.charAt(0);//0 a length()-1
		String texto  = s1.toString();
		
		//LOCALIZAÇÃO
		int posicao = s3.indexOf("Virtual");
		System.out.println(posicao);
		int ultima = s3.lastIndexOf('a');
		System.out.println(ultima);
		boolean vazia = s3.isEmpty();
		System.out.println(vazia);
		
		//COMPARACAO
		String xti = "XTI";
		//boolean x = xti.equals("xti");
		
		//verifica se a string é igual ignorando o case
		//boolean x = xti.equalsIgnoreCase("xti");
		
		//verifica se começa com
		//boolean x = xti.startsWith("xti");
		
		//boolean x = xti.endsWith("TI");
		//System.out.println(x);
		
		//compara se vem antes ou depois
		//pode ser usado para ordenar numeros ou textos
		int c = "amor".compareTo("bola");// retorna -1
		System.out.println(c);
		
		int d = "bola".compareTo("amor");// retorna +1
		System.out.println(d);
		
		int e = "amor".compareTo("amor");// retorna +1
		System.out.println(e);
	
		int f = "123".compareTo("234");// retorna +1
		System.out.println(f);
		
		String so = "Olhe, olhe";
		boolean o = so.regionMatches(6, "Olhe", 0, 4);
		System.out.println(o);
		
		//EXTRACAO
		
		String l = "O Brasil é Lindo";
		//Encontrar um pedaço de texto
		String s5 = l.substring(11);
		System.out.println(s5);
		String s6 = l.substring(2,8);
		System.out.println(s6);
		
		s5 = l.concat(" que Maravilha");
		System.out.println(s5);
		
		s5 = l.replace('s', 'z');
		System.out.println(s5);
		s5 = l.replaceFirst(" ", "X");
		System.out.println(s5);
		
		s5 = l.replaceAll(" ", "X");
		System.out.println(s5);
		
		s5 = l.toUpperCase();
		System.out.println(s5);
		
		s5 = l.toLowerCase();
		System.out.println(s5);
		
	
	}

}
