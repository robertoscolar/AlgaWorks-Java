package com.algaworks.fjoo.exemploio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {

    public static void main(String[] args) {
        String [] emails = {"joao@joao.com", "maria@maria.com", "roberta@roberta.com"};

        /*
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("emails.txt"));
            for (String email : emails) {
                writer.write(email);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Não conseguiu gravar o arquivo." + e.getMessage());;
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

         */

        //try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true   ))) {
        try (PrintStream writer = new PrintStream("emails2.txt")){

            for (String email : emails) {
                //writer.write(email);
                //writer.newLine();
                writer.println(email);
            }
        } catch (IOException e) {
            System.err.println("Não conseguiu gravar o arquivo." + e.getMessage());
        }
    }
}
