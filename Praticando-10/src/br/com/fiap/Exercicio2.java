package br.com.fiap;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exercicio2 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataInical = JOptionPane.showInputDialog("Digite uma data inicial: ");
        String dataFinal = JOptionPane.showInputDialog("Digite a data final: ");
        LocalDate dataInicial = LocalDate.parse(dataInical,dtf);
        LocalDate dataFinalX = LocalDate.parse(dataFinal, dtf);
        Period periodo = Period.between(dataInicial, dataFinalX);
        JOptionPane.showMessageDialog(null, String.format("Data Inicial: %s \nData Final: %s \nEntre as datas fornecidas existem: %d ano(s), %d mês(es) e %d dia(s)", dataInicial.format(dtf), dataFinalX.format(dtf), periodo.getYears(), periodo.getMonths(), periodo.getDays()));
    }
}
