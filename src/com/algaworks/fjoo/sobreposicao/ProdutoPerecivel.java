package com.algaworks.fjoo.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

	protected Date dataValidade;
	
	public void descrever() {
		super.descrever();
		System.out.println("Minha data de validade é: " + dataValidade);
	}
}
