package com.algaworks.fjoo.polimorfismo;

public class TestePolimorfismo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setSaldo(4000);
		//ou TestePolimorfismo.imprimirSaldo(conta)
		imprimirSaldo(conta);
		System.out.println();
		
		//----------------------------------------------------------
		
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		TestePolimorfismo.imprimirSaldo(contaCorrente);
		System.out.println();
		
		//----------------------------------------------------------
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		TestePolimorfismo.imprimirSaldo(contaPoupanca);
		System.out.println();
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$" + conta.getSaldo());
		//casting de objeto
		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente)conta;
			System.out.println("O limite da conta corrente é: R$" + cc.getLimite());
		}
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca)conta;
			System.out.println("O rendimento da conta poupança é: R$" + cp.getRendimentos());
		}
	}
}

