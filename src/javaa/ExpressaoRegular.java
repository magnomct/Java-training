package javaa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String padrao = "Java";
		String texto = "Java";
		boolean b = texto.matches(padrao);
		System.out.println(b);

		boolean c = "Java".matches("java");
		System.out.println(c);
		
		/*MODIFICADORES
		(?i), Ignora maiúscula e minúscula
		(?x), Comentarios
		(?m), Multilinhas
		(?s), Dottal
		 */
	
		//(?i), Ignora maiúscula e minúscula
		
		boolean d = "Java".matches("(?i)java");
		System.out.println(d);
		
		/*METACARACTERES
		 * .qualquer caractere
		 * \d dígitos      [0-9]
		 * \D não é digito [^0-9]
		 * \s espaços      [ \t\n\x0B\f\r]
		 * \S não é espaço [^\s]
		 * \w letra        [a-zA-Z_0-9] 
		 * \W não é letra
		 * */
		
		d = "@".matches(".");
		d = "2".matches("\\d");
		d = "A".matches("\\w");
		d = " ".matches("\\s");
		//procura um caractere - falso
		d = "Pi".matches(".");
		System.out.println(d);
		
		//procura dois caractere - true
		d = "Pi".matches("..");
		System.out.println(d);
		
		//procura três caracteres - true
		d = "Pie".matches("...");
		System.out.println(d);
		
		//procura dois digitos - true
		d = "21".matches("\\d\\d");
		System.out.println(d);
		
		//procura dois digitos - true
		d = "70".matches("\\d\\d");
		System.out.println(d);
		
		//procura cep - true
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		d = "70294-070".matches(cep);
		System.out.println(d);
		
		/*
		 * QUANTIFICADORES
		 * 
		 * X{n}		X, exatamente n vezes
		 * X{n,}	X, pelo menos n vezes
		 * X{n, m}	X, pelo menos n mas não mais do que m vezes
		 * X?		X, 0 ou 1 vez
		 * X*		X, 0 ou + vezes
		 * X+		X, 1 ou + vezes
		 * 
		 * */		 
		
		//Quantificador 1
		d = "21".matches("\\d{2}");
		System.out.println("teste q1 " + d);
		
		//Quantificador 2
		d = "123".matches("\\d{2,}");
		System.out.println("teste q2 " + d);
		
		//Quantificador 3 true
		d = "12345".matches("\\d{2,5}");
		System.out.println("teste q3 " + d);
		
		//Quantificador 4 true
		d = "".matches(".?");
		System.out.println("teste q4 " + d);
		
		//Quantificador 4 false
		d = "aa".matches(".?");//so avalia entre 0 e 1 vez
		System.out.println("teste q4 " + d);
		
		//Quantificador 5 true
		d = "ab".matches(".*");//so avalia entre 0 ou + vezes
		System.out.println("teste q5 " + d);
		
		//Quantificador 6 true
		d = "ab".matches(".+");//so avalia entre 1 ou + vezes
		System.out.println("teste q6 " + d);
		
		//Quantificador 6 falso
		d = "".matches(".+");//0 vez - so avalia entre 1 ou + vezes
		System.out.println("teste q6 " + d);
		
		
		
				
		
		//procura cep com quantificador - true
		cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		d = "70294-070".matches(cep);
		System.out.println(d);
		
		//valida cep com quantificador
		d = "70294-070".matches("\\d{5}-\\d{3}");
		System.out.println("cep " + d);
		
		//valida data com quantificador
		d = "12/02/1980".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println("data" + d);
		
		/*
		 * METACARACTER DE FRONTEIRA
		 * ^ inicia 
		 * $ finaliza
		 * | ou
		 * */
		
		//Começa com Pier e termina com 0 ou mais caracteres
		
		d = "Pier21".matches("^Pier.*");
		System.out.println("Inicia" + d);
		
		//finaliza com 21
		
		d = "Pier21".matches(".*21$");
		System.out.println("finaliza com 21" + d);
		
		//tem java aqui
		
		d = "tem java aqui".matches(".*java.*");
		System.out.println("tem java" + d);
		
		d = "tem java aqui".matches("^tem.aqui.$");
		
		d = "sim".matches("sim | não");
		
		/* AGRUPADORES
		 * [...]			Agrupamento
		 * [a-z]			Alcance
		 * [a-e][i-u]		União
		 * [a-z&&[aeiou]]	Interseção
		 * [^abc]			Exceção
		 * [a-z&&[^m-p]]	Subtração
		 * \x				Fuga literal
		 * */
		
		
		 b = "x".matches("[a-z]");
		 System.out.println("tem letra " + b);
		 
		 b = "3".matches("[0-9]");
		 System.out.println("tem letra " + b);
		 
		 b = "True".matches("[tT]rue");//true ou True
		 System.out.println("tem letra " + b);
		 
		 b = "True".matches("[tT]rue|[yY]es");//true ou True - ou Yes
		 System.out.println("tem letra " + b);
		 
		 b = "yes".matches("[tT]rue|[yY]es");//true ou True - ou Yes
		 System.out.println("tem letra " + b);
		 
		 b = "True".matches("[tT]rue|[yY]es");//true ou True - ou Yes
		 System.out.println("tem letra " + b);
		 
		 b = "Beatriz".matches("[A-Z][a-zA-Z]*");//primeiro nome maiusculo
		 b = "olho".matches("[^abc]lho");//valida todas exceto abc +lho
		 b = "crau".matches("cr[ae]u");
		 b = "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}");//validação de email
		 
		 //procurar depois validação de email completa
		 
		 String doce = "Qual é o Doce mais doCe que o doce?";
		 Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);//para validacao de varias palavras
		 while(matcher.find()){
			 System.out.println(matcher.group());
		 }
		 
		 /* SUBSTITUIÇÕES
		  * 
		  * */
		 
		 String r = doce.replaceAll("(?i)doce", "DOCINHO");
		 System.out.println(r);
		 
		 String rato = "O rato roel a roupa do rei de roma";
		 r = rato.replaceAll("r", "XX");
		 System.out.println(r);
		 
		 r = "Tabular este texto".replaceAll("\\s", "\t");
		 System.out.println(r);
		 
		 String url = "www.xti.com.br/clientes-2011.html";
		 			  //http://www.xti.com.br/2011/clientes.jsp
		 String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		 b = url.matches(re);
		 System.out.println(b); //teste de validação
		 
		 re = "(www.xti.com.br/)(\\w{2,})-(\\d{4}).html"; //em parenteses vira variavel
		 
		 
		 r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		 System.out.println(r);
		 System.out.println(url);
		 		 	
		}

}
