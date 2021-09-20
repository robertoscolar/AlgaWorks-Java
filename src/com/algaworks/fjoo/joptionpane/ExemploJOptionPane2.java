package com.algaworks.fjoo.joptionpane;

import javax.swing.*;

public class ExemploJOptionPane2 {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null, "Ol�!");

        JOptionPane.showMessageDialog(null, "Aten��o - e-mail n�o informado",
                "Aten��o", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "Aten��o - e-mail n�o informado",
                "Erro", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);

        //Para atribuir imagem:
        //URL url = ExemploJOptionPane2.class.getResource("imagem.png");
        //Icon icon = new ImageIcon(url);
        //JOptionPane.ShowMessageDialog(null,"Obrigado por escolher a AlgaWorks","Algaworks", +
        //JOptionPane.INFORMATION_MESSAGE, icon;

    }
}
