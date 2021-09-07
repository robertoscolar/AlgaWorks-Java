package com.algaworks.fjoo.abstracao;

public class TesteClasseAbstrata {

	public static void main(String[] args) {
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.dataValidade = "22/12/2021";
		pp.setDescricao("Caixa de leite");
		
		pp.imprimirDescricao();
	}
}
