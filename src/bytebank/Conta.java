package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;
	
	/**
	 * CONSTRUTOR
	 */
	
	public Conta() {}
	
	public Conta(double saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public Conta(double saldo, int agencia, int numero, String titular) {
		this.saldo = saldo;
		this.setAgencia(agencia);
		this.setNumero(numero);
		this.titular = titular;
	}

	/**
	 * toString
	 */
	public String toString() {
		return "toString: " + this.titular +" - "+ this.saldo;
	}
	
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * MÉTODOS
	 * @param valor
	 */
	
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