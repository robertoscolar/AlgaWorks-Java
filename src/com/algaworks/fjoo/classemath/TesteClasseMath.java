package com.algaworks.fjoo.classemath;

import static java.lang.Math.PI;
//agora n�o � mais necess�rio Math.PI

public class TesteClasseMath {
    public static void main(String[] args) {

        //static final double PI =3.14;

        // Comprimento  de uma circunfer�ncia 2 x r x pi (3,14)
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento: " + comprimento);

        // M�ximo e m�nimo
        double [] precosProdutoA = {30.20, 25.49};
        double maiorPreco = Math.max(precosProdutoA[0], precosProdutoA[1] );
        System.out.println("O maior pre�o �: " + maiorPreco);
        System.out.println("O menor pre�o �: " + Math.min(precosProdutoA[0], precosProdutoA[1]));

        // Pot�ncia
        System.out.println("2^3 = " + Math.pow(2,3));

        // Raiz quadrada
        System.out.println("Raiz quadrada de 9 = " + Math.sqrt(9));

        // Arredondamento ceil, floor e round
        double n = 5.68;
        System.out.println("Maior inteiro: " + Math.ceil(n));
        System.out.println("Menor inteiro: " + Math.floor(n));
        System.out.println("Arredondando: " + Math.round(n));

        // Trigonometria
        //funciona com seno, cosseno e tangente
        System.out.println("Seno: " + Math.sin(40));

        // N�meros randomicos
        double numeroAleatorio = Math.random() * 100;
        System.out.println(numeroAleatorio);
    }
}
