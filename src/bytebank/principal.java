package bytebank;

public class principal{
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.setSaldo(400);
		
		Conta segundaConta = new Conta();
		segundaConta.setSaldo(primeiraConta.getSaldo());
		
		primeiraConta.setSaldo(primeiraConta.getSaldo() + 1);
		
		/*
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		*/
		
		Conta conta1 = new Conta(500,50095,13222,"Marcos Silva");
		System.out.println(conta1.getTitular()+" => Saldo inicial de = "+conta1.getSaldo());
		
		Conta conta2 = new Conta(1000,50095,13222,"Fábio Souza");
		System.out.println(conta2.getTitular()+" => Saldo inicial de = "+conta2.getSaldo());
		
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
			System.out.println(contaSaque.getTitular()+" => SAQUE => "+valorSaque+" efetuado com Sucesso! Seu novo saldo é: "+contaSaque.getSaldo());
		} else {
			System.out.println(contaSaque.getTitular()+" => Você não possui saldo suficiente! Seu saldo é: "+contaSaque.getSaldo());
		}
		
		/*
		 * TRANSFERÊNCIA
		 */
		
		double valorTransf = 300;
		Conta contaOrigem = conta1;
		Conta contaDestino = conta2;
		
		if(contaOrigem.transfere(valorTransf, contaDestino)) {
			System.out.println(contaOrigem.getTitular()+" => TRANSFERE => "+valorTransf+" => "+contaDestino.getTitular()+" => SUCESSO!");
			contaOrigem.imprimeSaldo();
			contaDestino.imprimeSaldo();
		}else {
			System.out.println(contaOrigem.getTitular()+" => Não possui saldo suficiente!");
		}
		
	}
}
