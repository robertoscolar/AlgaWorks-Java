package com.algaworks.fjoo.cafe;

public class MaquinaCafe {

	private int acucarDisponivel;
	
	public void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("Não há açúcar disponível.");
		}else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo com seu café com " + quantidadeAcucar + " gramas de açúcar.");
		}
	}
	/*
	public void fazerCafe() {
		if (acucarDisponivel < 10) {
			System.out.println("Não há açúcar o suficiente para o café.");
		}else {
			acucarDisponivel =- 10;
			System.out.println("Fazendo seu café com 10 gramas de açúcar(padrão).");
		}
		
	}
	*/
	public void fazerCafe() {
		fazerCafe(10);
	}
	
	public int getAcucarDisponivel() {
		return acucarDisponivel;
	}
	public void setAcucarDisponivel(int acucarDisponivel) {
		this.acucarDisponivel = acucarDisponivel;
	}
	
	
}

