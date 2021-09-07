package com.algaworks.fjoo.classemath;

import static java.lang.Math.PI;
//agora não é mais necessário Math.PI

public class TesteClasseMath {
    public static void main(String[] args) {

        //static final double PI =3.14;

        // Comprimento  de uma circunferência 2 x r x pi (3,14)
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento: " + comprimento);

        // Máximo e mínimo
        double [] precosProdutoA = {30.20, 25.49};
        double maiorPreco = Math.max(precosProdutoA[0], precosProdutoA[1] );
        System.out.println("O maior preço é: " + maiorPreco);
        System.out.println("O menor preço é: " + Math.min(precosProdutoA[0], precosProdutoA[1]));

        // Potência
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

        // Números randomicos
        double numeroAleatorio = Math.random() * 100;
        System.out.println(numeroAleatorio);
    }
}
