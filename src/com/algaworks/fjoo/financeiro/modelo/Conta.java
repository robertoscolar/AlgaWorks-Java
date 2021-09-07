package com.algaworks.fjoo.financeiro.modelo;

public class Conta {

	public String descricao;
	public double valor;
	public String dataVencimento;
	private SituacaoConta situacaoConta;
	
	public Conta () {
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void cancelar () throws OperacaoContaException {
		if (this.situacaoConta != SituacaoConta.CANCELADA) {
			this.situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Conta cancelada com louvor!");
		}else {
			throw new OperacaoContaException("A conta já está cancelada.");
		}
 	}
}
