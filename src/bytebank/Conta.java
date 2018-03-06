package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public Conta() {}
	
	public Conta(double saldo, int agencia, int numero, String titular) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta conta) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			conta.deposita(valor);
			return true;
		}
		return false;
	}
	
	public void imprimeSaldo() {
		System.out.println(this.titular+" => SALDO: "+this.saldo);
	}
	
}