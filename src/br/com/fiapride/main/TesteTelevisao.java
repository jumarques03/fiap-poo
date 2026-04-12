package br.com.fiapride.main;

import br.com.fiapride.model.Canal;
import br.com.fiapride.model.SmartTV;
import br.com.fiapride.model.Televisao;

public class TesteTelevisao {

    public static void main(String[] args) {
        // --- Teste da Televisao Comum ---
        Televisao televisao01 = new Televisao("LG", 50);
        Canal globo = new Canal(5, "Globo");
        Canal sbt = new Canal(4, "SBT");

        System.out.println("=== TESTE TELEVISÃO COMUM ===");
        televisao01.ligar();
        televisao01.sintonizarCanal(globo);
        televisao01.ajustarVolume(25);

        System.out.println("\n--- Estado Final da Televisão Comum ---");
        System.out.println("Marca: " + televisao01.getMarca());
        System.out.println("Assistindo agora: " + televisao01.getCanalAtual().getNome());
        System.out.println("Volume: " + televisao01.getVolume());
        
        // --- Teste da SmartTV ---
        System.out.println("\n=== TESTE SMART TV ===");
        SmartTV smart01 = new SmartTV("Samsung", 65, "Tizen", "Wi-Fi");

        System.out.println("Sistema: " + smart01.getSistemaOperacional());
        System.out.println("Conexão: " + smart01.getTipoConexaoInternet());

        // Testando métodos herdados de Televisao
        smart01.ligar();
        smart01.sintonizarCanal(sbt);
        smart01.ajustarVolume(40);

        System.out.println("\n--- Estado Final da SmartTV ---");
        System.out.println("Marca: " + televisao01.getMarca());
        if (smart01.getCanalAtual() != null) {
            System.out.println("Assistindo agora: " + smart01.getCanalAtual().getNome());
        }
        System.out.println("Volume: " + smart01.getVolume());
        System.out.println("Sistema: " + smart01.getSistemaOperacional());
        System.out.println("Conexão: " + smart01.getTipoConexaoInternet());
    }
}