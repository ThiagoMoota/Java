package br.com.fiap;

import javax.swing.*;

public class FraseDigitada {
    public static void main(String[] args) {
        try {
            String frase = JOptionPane.showInputDialog("Digite uma frase: ");
            JOptionPane.showMessageDialog(null, frase.length() + "\n" + frase.toUpperCase());
            String palavra1 = JOptionPane.showInputDialog("Digite uma palavra existente: ");
            String palavra2 = JOptionPane.showInputDialog("Substitua a primeira palavra digitada: ");
            frase = frase.replace(palavra1, palavra2);
            JOptionPane.showMessageDialog(null, frase);
            JOptionPane.showMessageDialog(null, frase.length());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "");
        }
    }
}
