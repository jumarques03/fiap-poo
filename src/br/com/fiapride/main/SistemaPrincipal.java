package br.com.fiapride.main;

import br.com.fiapride.model.Televisao;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // televisao01.estaLigada começa em false por padrão
        Televisao televisao01 = new Televisao(23, 515);

        Televisao televisao02 = new Televisao(12,720);
        televisao02.estaLigada = true;

        System.out.println("--- Televisão 01 ---");
        televisao01.ligarTelevisao(televisao01.estaLigada);
        televisao01.aumentarVolume(televisao01.estaLigada, 27);

        System.out.println("\n--- Televisão 02 ---");
        televisao02.ligarTelevisao(televisao02.estaLigada);
        televisao02.aumentarVolume(televisao02.estaLigada, 0);

        televisao02.ligarTelevisao(televisao02.estaLigada);
        televisao02.aumentarVolume(televisao02.estaLigada, 110);
    }
}