package com.algaworks.fjoo.exemploio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("emails2.txt"))) {

            //String email = reader.readLine();
            //while (email != null && !email.trim().equals("")) {7
            String email = null;
            while ((email = reader.readLine()) != null) {
                System.out.println("Enviando e-mail para: " + email);
                //email = reader.readLine();
            }

        }catch (IOException e) {
            System.err.println("Não conseguiu ler o arquivo. Erro: " + e.getMessage());
        }
    }
}
