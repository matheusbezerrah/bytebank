package bytebank;

public class principal{
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 400;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = primeiraConta.saldo;
		
		primeiraConta.saldo++;
		
		/*
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		*/
		
		Conta conta1 = new Conta(500,50095,13222,"Marcos Silva");
		System.out.println(conta1.titular+" => Saldo inicial de = "+conta1.saldo);
		
		Conta conta2 = new Conta(1000,50095,13222,"Fábio Souza");
		System.out.println(conta2.titular+" => Saldo inicial de = "+conta2.saldo);
		
		/*
		 * DEPÓSITO
		 */
		
		conta1.deposita(100);
		
		/*
		 * SAQUE
		 */
		
		double valorSaque = 100;
		Conta contaSaque = conta1;
		
		if(contaSaque.saca(valorSaque)) {
			System.out.println(contaSaque.titular+" => SAQUE => "+valorSaque+" efetuado com Sucesso! Seu novo saldo é: "+contaSaque.saldo);
		} else {
			System.out.println(contaSaque.titular+" => Você não possui saldo suficiente! Seu saldo é: "+contaSaque.saldo);
		}
		
		/*
		 * TRANSFERÊNCIA
		 */
		
		double valorTransf = 300;
		Conta contaOrigem = conta1;
		Conta contaDestino = conta2;
		
		if(contaOrigem.transfere(valorTransf, contaDestino)) {
			System.out.println(contaOrigem.titular+" => TRANSFERE => "+valorTransf+" => "+contaDestino.titular+" => SUCESSO!");
			contaOrigem.imprimeSaldo();
			contaDestino.imprimeSaldo();
		}else {
			System.out.println(contaOrigem.titular+" => Não possui saldo suficiente!");
		}
		
	}
}
