package com.algaworks.fjoo.enums;

public enum OperadorAritmetico {

	SOMA {
		@Override
		public int operacao(int x, int y) {
			return x + y;
		}
	},	SUBTRACAO {
		@Override
		public int operacao(int x, int y) {
			return x - y;
		}
	};
	

	public abstract  int operacao (int x, int y);
}
