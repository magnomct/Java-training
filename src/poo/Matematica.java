package poo;

public class Matematica {
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros
	 */
	
	int maior(int um, int dois){
		if(um > dois){
			return um;
		} else {
			return dois;
		}
	}
		
	double soma(double um, double dois){
		double s = um + dois;
		return s;
		
	}
	
	double somaa(String titulo, double ... numeros) {
		System.out.println(titulo);
		double total = 0;
		for(double n:numeros){
			total += n;
		}
		return total;
	}
	
	double media(String x, String y) {
		System.out.println("media(String x, String y)");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix+iy)/2;
	}
	
	
}
