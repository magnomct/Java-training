package poo;

public class Conta {
	
	String cliente;
	double saldo;
	
	void exibeSaldo(){
		System.out.println(cliente +" seu saldo � "+ saldo);
		}

	void saca(double valor) {
		//ver se tem autoriza��o
		//se o limite do dia n�o foi ultrapassado
		//se tem saldo na conta
		//>>>>>deduzir do valor o valor do saque
		
		saldo = saldo - valor;
		//saldo-=valor;
		
		//atualizar registros do banco
		//entregar o dinheiro ao cliente
	}
	
	void deposita(double valor) {
		saldo +=valor;
	}
	
	void transferePara(Conta destino, double valor) {
		
		this.saca(valor);
		destino.deposita(valor);
	}
	
}
