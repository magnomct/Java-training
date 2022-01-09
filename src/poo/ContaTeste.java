package poo;

public class ContaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		conta.cliente = "Ricardo";
		conta.saldo = 10000.00;
		conta.exibeSaldo();
		
		//conta.saca(1000);
		//conta.exibeSaldo();
		
		//conta.deposita(6000);
		//conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Lawrence";
		destino.saldo = 8000.00;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1550.00);
		conta.exibeSaldo();
		destino.exibeSaldo();

	}

}
