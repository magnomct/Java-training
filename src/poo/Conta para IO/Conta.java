package poo;

public class Conta {
	
	private String cliente;
	private double saldo;
	
	public Conta(){}
	public Conta(String cliente,double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}
	public String getCliente() {
		return cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void exibeSaldo()
	{
		System.out.println(cliente +" seu saldo � "+ saldo);
		}

	public void saca(double valor) {
		//ver se tem autoriza��o
		//se o limite do dia n�o foi ultrapassado
		//se tem saldo na conta
		//>>>>>deduzir do valor o valor do saque
		
		saldo = saldo - valor;
		//saldo-=valor;
		
		//atualizar registros do banco
		//entregar o dinheiro ao cliente
	}
	
	public void deposita(double valor) {
		saldo +=valor;
	}
	
	public void transferePara(Conta destino, double valor) {
		
		this.saca(valor);
		destino.deposita(valor);
	}
	
}
