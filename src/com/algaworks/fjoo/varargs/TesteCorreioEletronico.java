package com.algaworks.fjoo.varargs;

public class TesteCorreioEletronico {

    public static void main(String[] args) {
        CorreioEletronico ce = new CorreioEletronico();

        /*

        String[] emails = new String[2];
        emails[0] = "joaodascouves@ola.com";
        emails[1] = "maria@ola.com";

        ce.enviarEmail(emails);

         */

        //ce.enviarEmail(new String[] {"joaodascouves@ola.com","mariadb@ola.com"});

        ce.enviarEmail("joao@joao.com","maria@db.com");
    }
}
