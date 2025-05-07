// Isadora Marcondes de Souza, RM:565845
// Thiago Rodrigues da Mota, RM: 563650

package br.fiap.com.bean;

public class DespesaFamiliar {
    //atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeAcademia;

    //métodos
    public double calcularTotalDeDespesas() {
        double despesascasa, descontoacademia, totaldespesas;
        descontoacademia = (numeroDeMoradores * valorMensalidadeAcademia);
        despesascasa = (gastoComLuz + gastoComAgua + gastoComInternet);
        totaldespesas = (descontoacademia + despesascasa);
        return totaldespesas;
    }
    public double calcularRendaFamiliarLiquida() {
        return rendaFamiliar - calcularTotalDeDespesas();
    }
}