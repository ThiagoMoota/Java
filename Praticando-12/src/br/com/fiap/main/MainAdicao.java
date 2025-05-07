package br.com.fiap.main;

import br.com.fiap.bean.Adicao;

import javax.swing.*;

public class MainAdicao {
    public static void main(String[] args) {
        Adicao soma = new Adicao();
        String auxiliar, escolha = "sim";
        int opcao, numInteiro1, numInteiro2, resultadoInteiro;
        double resultadoReal, numReal1, numReal2;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                auxiliar = JOptionPane.showInputDialog("Qual soma deseja calcular? \n(1) Números Inteiros\n(2) Números Reais.");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                    auxiliar = JOptionPane.showInputDialog("Digite o primero número inteiro a ser somado: ");
                    numInteiro1 = Integer.parseInt(auxiliar);
                    auxiliar = JOptionPane.showInputDialog("Digite o segundo número inteiro a ser somado: ");
                    numInteiro2 = Integer.parseInt(auxiliar);
                    resultadoInteiro = soma.somarInteiro(numInteiro1, numInteiro2);
                    JOptionPane.showMessageDialog(null, String.format("O resultado é: %d ", resultadoInteiro));
                    break;
                    case 2:
                    auxiliar = JOptionPane.showInputDialog("Digite o primero número real a ser somado: ");
                    numReal1 = Double.parseDouble(auxiliar);
                    auxiliar = JOptionPane.showInputDialog("Digite o segundo número real a ser somado: ");
                    numReal2 = Double.parseDouble(auxiliar);
                    resultadoReal = soma.somarReal(numReal1, numReal2);
                    JOptionPane.showMessageDialog(null, String.format("O resultado é: %f", resultadoReal));
                    break;
                    default:
                        throw new Exception("Escolha incorreta!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa. Volte sempre!");
    }
}
