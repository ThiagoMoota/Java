package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Arrays;

public class FiltroSemStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<String>(
                Arrays.asList("Homem Aranha", "Wolverine", "Hulk", "Capitão América", "Homem Elástico", "Mulher maravilha", "Pantera Negra", "Viúva Negra", "Homem de Ferro", "Miss Marvel", "Mulher Invisível", "Cíclope")
        );

        ArrayList<String> heroisComH = new ArrayList<String>();
        for (String heroi : herois){
            if (heroi.startsWith("H")) {
                heroisComH.add(heroi);
            }
        }
        System.out.println("Heróis que começam com a letra H\n" + heroisComH);
    }
}
