import javax.swing.JOptionPane;

/**
 *Calcular o IMC
 *IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
 */


 
public class IMC {
	
	public static void main(String[] args){
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso em quilogramas?");
		String altura = JOptionPane.showInputDialog("Qual a sua altura em metros?");
				
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		
		String msg = (imc >=20 && imc <=25) ? "Peso Ideal" : "Fora do peso ideal";
		msg = "IMC = " + imc + "\n" +msg;
		
		JOptionPane.showMessageDialog(null, msg);
		
	}

}