package com.algaworks.fjoo.enums;

public class TesteOperadorEnum {

	public static void main(String[] args) {
		OperadorAritmetico o1 = OperadorAritmetico.SOMA;
		
		int resultado1 = o1.operacao(2, 5);
		System.out.println(resultado1);
		
		for (OperadorAritmetico oa : OperadorAritmetico.values()) {
			System.out.println(oa + " -> " + oa.operacao(4, 2));
		}
		
		/*for (String s : args) {
			
		}
		*/
	}
}
