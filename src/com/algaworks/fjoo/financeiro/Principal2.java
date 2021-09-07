package com.algaworks.fjoo.financeiro;

import com.algaworks.fjoo.financeiro.modelo.*;

public class Principal2 {

	public static void main(String[] args) {
		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		// instanciando clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");
		
		// instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		
		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 
			5200d, "13/05/2012");

		try {
			contaPagar1.pagar();
			contaPagar1.cancelar();

			contaPagar2.cancelar();
			contaPagar2.pagar();

			contaReceber1.cancelar();
			contaReceber1.receber();

			contaReceber2.receber();
			contaReceber2.cancelar();
		} catch (OperacaoContaException e) {
			System.out.println("Operação inválida: "+e.getMessage());
		}finally {
			System.out.println("Obrigado por utilizar nosso sistema!");
		}

	}

}
