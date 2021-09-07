package com.algaworks.fjoo.abstracao;

//não é possível criar objetos de classes abstratas
public abstract class Produto {
	
	private String descricao;

	public abstract void imprimirDescricao();
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

