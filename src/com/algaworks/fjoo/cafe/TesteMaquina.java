package com.algaworks.fjoo.cafe;

public class TesteMaquina {

	public static void main(String[] args) {
		
		MaquinaCafe maquina = new MaquinaCafe();
		maquina.setAcucarDisponivel(30);
		maquina.fazerCafe(10);
		maquina.fazerCafe(15);

		// faz cafe com a quantidade de a��car padr�o
		// n�o ser� poss�vel fazer esse cafezinho, pois a m�quina
		// s� tinha 30gr de a��car dispon�vel
		maquina.fazerCafe();
	}
}
