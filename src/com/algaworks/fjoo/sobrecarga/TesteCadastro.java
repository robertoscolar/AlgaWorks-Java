package com.algaworks.fjoo.sobrecarga;

public class TesteCadastro {

	public static void main(String[] args) {
		
		CadastroPessoa cadastro = new CadastroPessoa();
		
		Pessoa p = new Pessoa ("Jo�o", 28);
		
		cadastro.cadastrar(p);
		
		//----------------------------------------------------------
		
		cadastro.cadastrar("Maria", 27);
		

	}

}
