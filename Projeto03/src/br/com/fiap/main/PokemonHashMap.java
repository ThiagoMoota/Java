package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemon = new HashMap<String, String>();
        do {
            try {
                String nome, tipo;
                do {
                    nome = JOptionPane.showInputDialog("Digite o nome de um pokémon, ou caso queira encerrar digite \"fim\" ").toUpperCase();
                        if (!nome.equals("FIM")){
                            if (pokemon.containsKey(nome)){
                                JOptionPane.showMessageDialog(null, "Este pokémon já foi cadastrado!");
                            } else {
                                tipo = JOptionPane.showInputDialog("Digite o tipo do pokémon informado anteriormente: ");
                                pokemon.put(nome, tipo);
                        }
                    }
                } while (!nome.equals("FIM"));

                String escolha = JOptionPane.showInputDialog("Digite o nome de um pokémon para saber o tipo ").toUpperCase();
                if (pokemon.containsKey(escolha)){
                    JOptionPane.showMessageDialog(null, "O tipo desse pokémon é: " + pokemon.get(escolha), "Nome do pokémon", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Pokémon não cadastrado!", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
