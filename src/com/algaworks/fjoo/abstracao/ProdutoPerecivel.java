package com.algaworks.fjoo.abstracao;

public class ProdutoPerecivel extends Produto {

	public String dataValidade;
	
	@Override
	public void imprimirDescricao() {
		System.out.println("Produto: " + super.getDescricao());
		System.out.println("Data de Validade: " + dataValidade );
	}

}
