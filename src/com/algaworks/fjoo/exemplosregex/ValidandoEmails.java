package com.algaworks.fjoo.exemplosregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {

    public static void main(String[] args) {
        String[] emails = {"jose@joao.com", "maria@", "rose.com"};

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " � um e-mail v�lido.");
            }else {
                System.out.println(email + " n�o � v�lido.");
            }
        }

    }
}
