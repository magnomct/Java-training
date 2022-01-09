package poo;

public class MatematicaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Matematica m = new Matematica();
		//int ma = m.maior(10, 20);
		//System.out.println(ma);
		
		Matematica m = new Matematica();
		
		int par = m.maior(2, 4);
		int impar = m.maior(3, 5);
		double so = m.soma(m.maior(2,4), m.maior(3,5));
		System.out.println(so);
		
		//double so = m.soma(10, 20);
		//System.out.println(so);
		
		double total = m.somaa("Numeros", 2,3,5,6,7,123,345,69);
		
		System.out.println("Total = " + total);
		
		//System.out.println(m.media(5, 3));
		System.out.println(m.media("50", "30"));

	}
	

}
