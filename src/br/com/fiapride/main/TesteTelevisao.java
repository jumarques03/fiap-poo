package br.com.fiapride.main;

import br.com.fiapride.model.Televisao;

public class TesteTelevisao {

    public static void main(String[] args) {

        Televisao televisao01 = new Televisao(23, 5);
        Televisao televisao02 = new Televisao(12, 7);

        System.out.println("--- Interação Televisão 01 ---");
        televisao01.ligar(); 
        televisao01.ajustarVolume(27);

        System.out.println("\n--- Interação Televisão 02 ---");
        // Tentando aumentar o volume com a TV desligada (deve dar erro)
        televisao02.ajustarVolume(50); 
        
        televisao02.ligar();
        televisao02.ajustarVolume(80);

        System.out.println("\n--- Teste de Validação Televisão 02 ---");
        televisao02.ajustarVolume(110); // Deve imprimir a mensagem de erro

        System.out.println("\n--- Interação Televisão 02 ---");
        televisao02.desligar();

        System.out.println("\n----------------------------------------------");
        System.out.println("\nEstado Final da TV 01:");
        System.out.println("Canal: " + televisao01.getNumeroCanal());
        System.out.println("Volume: " + televisao01.getVolume());
        System.out.println("Ligada?: " +televisao01.getEstaLigada());

        System.out.println("\nEstado Final da TV 02:");
        System.out.println("Canal: " + televisao02.getNumeroCanal());
        System.out.println("Volume: " + televisao02.getVolume());
        System.out.println("Ligada?: " +televisao02.getEstaLigada());
        System.out.println("\n----------------------------------------------");
        
        // televisao02.volume = 30; -> Gera erro de compilação 
    }
}