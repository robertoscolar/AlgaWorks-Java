package com.algaworks.fjoo.heranca;

public class Pessoa {

	//quem tem acesso ao protected?
	//entidades no mesmo pacote ou que estiverem herdando esta classe
	
	protected String nome;
	protected int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void dizerNome() {
		System.out.println("Olá, eu sou o " + nome + " e tenho " + idade + " anos.");
	}
}
