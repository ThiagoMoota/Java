// Isadora Marcondes de Souza, RM:565845
// Thiago Rodrigues da Mota, RM: 563650

package br.fiap.com.main;

import br.fiap.com.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesas = new DespesaFamiliar(); // Declarando e Instanciando o objeto
        Scanner scanner = new Scanner(System.in); // Criando o Scanner para ler os dados

        System.out.print("Digite o valor da renda familiar: ");
        double rendaFamiliar = scanner.nextDouble();
        System.out.print("Digite o número de moradores: ");
        int numeroDeMoradores = scanner.nextInt();
        System.out.print("Digite o valor gasto com luz: ");
        double gastoComLuz = scanner.nextDouble();
        System.out.print("Digite o valor gasto com água: ");
        double gastoComAgua = scanner.nextDouble();
        System.out.print("Digite o valor gasto com internet: ");
        double gastoComInternet = scanner.nextDouble();
        System.out.print("Digite o valor da mensalidade da academia: ");
        double valorMensalidadeDaAcademia = scanner.nextDouble();
        scanner.close(); // fecha o Scanner

        // atribuir os valores ao objeto
        despesas.rendaFamiliar = rendaFamiliar;
        despesas.numeroDeMoradores = numeroDeMoradores;
        despesas.gastoComLuz = gastoComLuz;
        despesas.gastoComAgua = gastoComAgua;
        despesas.gastoComInternet = gastoComInternet;
        despesas.valorMensalidadeAcademia = valorMensalidadeDaAcademia;

        // Passando mensagem final com o cálculo para o usuário usando o printf
        System.out.printf("A renda desta família é: R$ %.3f \nO total de gastos com despesas é: %.3f \nO valor da renda familiar líquida é: %.3f ", despesas.rendaFamiliar, despesas.calcularTotalDeDespesas(), despesas.calcularRendaFamiliarLiquida());
    }
}
