package com.algaworks.fjoo.arquivoproperties;

import java.io.FileInputStream;
import java.util.Properties;

public class LendoArquivoProperties {

    public static void main(String[] args) throws Exception {
        //Conectar no banco de dados
        //String url = "jdbc:mysql/localhost/cadastro_cliente";
        //String usuario = "root";
        //String senha = "root";

        Properties prop = new Properties();
        prop.load(new FileInputStream("./config/config.properties"));
        String url = prop.getProperty("banco.dados.url");
        String usuario = prop.getProperty("banco.dados.usuario");
        String senha = prop.getProperty("banco.dados.senha");

        System.out.printf("Entrando no banco de dados %s \n", url);
        System.out.printf("Usuario %s", usuario);

    }
}
