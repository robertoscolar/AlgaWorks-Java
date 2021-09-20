package com.algaworks.fjoo.joptionpane;

import javax.swing.*;

public class ExemploJOptionPane4 {
    public static void main(String[] args) {

        Object[] possibilidades = {"Masculino", "Feminino"};

        String nome = (String) JOptionPane.showInputDialog(null, "Digite o seu nome", "Algaworks",
                JOptionPane.PLAIN_MESSAGE,null,  null, null);

        String sexo = (String) JOptionPane.showInputDialog(null,"Selecione o sexo", "Algaworks",JOptionPane.PLAIN_MESSAGE,null,
                possibilidades, possibilidades[0]);


        System.out.println("Seu nome é: " + nome);
        System.out.println("Sexo selecionado: " + sexo);
    }
}
