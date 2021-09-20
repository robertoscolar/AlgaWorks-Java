package com.algaworks.fjoo.joptionpane;

import javax.swing.*;
import java.awt.*;

public class ExemploJOptionPane1 {
    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        JOptionPane.showMessageDialog(null, "Perigo!");
    }
}
