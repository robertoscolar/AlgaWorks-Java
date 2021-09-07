package com.algaworks.fjoo.enums;

public enum Naipe {

	OURO("Vermelho"),
	ESPADA("Preto"),
	COPAS("Vermelho"),
	PAUS("Preto");
	
	Naipe(String cor) {
		this.cor = cor;
	}
	
	private String cor;
	
	public String getCor() {
		return cor;
	}
}
