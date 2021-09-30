package com.algaworks.fjoo.exemploio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoArquivosItensPedido {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("itens_produtos.txt")))) {

            scanner.useDelimiter(";");
            Locale localeBrasil = new Locale("pt", "br" );
            scanner.useLocale(localeBrasil);

            NumberFormat formatador = NumberFormat.getCurrencyInstance(localeBrasil);

            while (scanner.hasNext()) {
                String produto = scanner.next();
                int quantidade = scanner.nextInt();
                double valor = scanner.nextDouble();
                scanner.nextLine();

                System.out.printf("Produto %s. \nQuantidade %d. \n Por: %s\n",
                        produto, quantidade, formatador.format(valor));

            }


        }catch (IOException e) {
            System.err.println("Erro abrindo arquivo. Erro: " + e.getMessage());
        }
    }
}
