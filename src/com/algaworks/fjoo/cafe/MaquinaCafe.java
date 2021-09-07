package com.algaworks.fjoo.cafe;

public class MaquinaCafe {

	private int acucarDisponivel;
	
	public void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("N�o h� a��car dispon�vel.");
		}else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo com seu caf� com " + quantidadeAcucar + " gramas de a��car.");
		}
	}
	/*
	public void fazerCafe() {
		if (acucarDisponivel < 10) {
			System.out.println("N�o h� a��car o suficiente para o caf�.");
		}else {
			acucarDisponivel =- 10;
			System.out.println("Fazendo seu caf� com 10 gramas de a��car(padr�o).");
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

