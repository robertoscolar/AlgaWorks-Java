package com.algaworks.fjoo.financeiro.modelo;

public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;
	

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this.situacaoConta = SituacaoConta.PENDENTE;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;	
	}
	
	public ContaPagar() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	

	public void pagar () throws OperacaoContaException {
		if (this.situacaoConta == SituacaoConta.PENDENTE) {
			this.situacaoConta = SituacaoConta.PAGA;
		}else {
			throw new OperacaoContaException("Você só pagar uma conta na situação pendente.");
		}
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	

}
