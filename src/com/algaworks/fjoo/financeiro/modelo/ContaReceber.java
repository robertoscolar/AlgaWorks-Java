package com.algaworks.fjoo.financeiro.modelo;

public class ContaReceber extends Conta {

	private Cliente cliente;

	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
		super();
		this.setCliente(cliente);
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public ContaReceber() {
		
	}
	
	
	public void receber() {
	}
	
	public void cancelar() throws OperacaoContaException {
		if (this.getValor() >= 50000) {
			super.cancelar();
		}else {
			throw new OperacaoContaException("Só podemos cancelar contas que estejam com um valor igual " +
					"ou superior á 50 mil");
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}