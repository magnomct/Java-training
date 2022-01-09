import java.util.Scanner;

public class Operador {

public static void main(String[]args){
		//2 + 3 operador binário
		//-2 operador unário
		//true ? "sim" : "não" operador ternário
		
		//String x = "9" + "4";
		//System.out.println(x);
		//============
		//double y = (7 - 4 + 3) * 2;
		//System.out.println(y);
		//============
		//int x = 6;
		//int y = ++x;//pré-incremento
		//int y = x++;//pós-incremento
		
		//System.out.println("x=" + x);
		//System.out.println("y=" + y);
		//============
		
		//int x = 6;
		
		//Operadores de comparação sempre retornam um boolean (v ou f)
		//System.out.println(x==6); System.out.println(x=!6);
		//System.out.println(x>6);  System.out.println(x<6);
		//System.out.println(x>=6); System.out.println(x>=6);
		
		//System.out.println(x instanceof int); erro pq int é primitivo
		
		//Integer x = 6;
		//System.out.println("pi" instanceof String); //pode com whapper
		
		//int x = 6;
		//System.out.println((x>=1)&& (x<=10));
		//System.out.println((x>=1)|| (x<=10));
		//System.out.println(!(x>=1)); //Operador de negação = inverte a resposta
		
		//int x = 6;
		//x = x + 3;
		//x += 3;
		//x = x - 3;
		//x -= 3;
		//x = x * 3;
		//x *=3;
		//x = x / 3;
		//x /=3;
		// x = x %3;
		//x %=3;
		//int x = 6;
		//System.out.println(x);
		
		// Operadores Especiais-Aula 18
		//?: Operador Ternário
		//, Separação de expressões
		
		//int idade = 6;
		//String x = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		//System.out.println(x);
		
		//String sexo = "M", pais = "Brasil"; //separa expressões string sexo-string país
		//System.out.println(x);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o raio");
		double raio = s.nextDouble();
		
		//Diâmetro : 2r
		//double raio = 10;
		double diametro = 2 * raio;
		System.out.println("Diametro="+diametro);
		
		//Circuferencia : 2 PI r	
		double pi = Math.PI;
		double circuferencia = 2 * pi * raio;
		System.out.println("Circuferencia="+circuferencia);
		
		//Area PI r2
		double area = pi * (raio * raio);
		System.out.println("Area="+area);
		
	}

}