package br.com.fiapride.main;

import br.com.fiapride.model.Canal;
import br.com.fiapride.model.Televisao;

public class TesteTelevisao {

    public static void main(String[] args) {
        Televisao televisao01 = new Televisao("LG", 50);
   
        Canal globo = new Canal(5, "Globo");
        Canal sbt = new Canal(4, "SBT");

        System.out.println("--- Teste de Associação e Ajuste de Volume ---");
        
        // Teste de sintonização com TV desligada
        televisao01.sintonizarCanal(globo); 

        // Teste de sintonização com TV ligada
        televisao01.ligar();
        televisao01.sintonizarCanal(globo);
        
        // Trocando a associação para outro objeto Canal
        televisao01.sintonizarCanal(sbt);
        televisao01.ajustarVolume(27);

        System.out.println("\n--- Estado Final da TV 01 ---");
        System.out.println("Marca: " + televisao01.getMarca());
        System.out.println("Tamanho: " + televisao01.getTamanhoPolegadas());
        System.out.println("Volume: " + televisao01.getVolume());

        
        // 2. Acessando dados do objeto associado
        if (televisao01.getCanalAtual() != null) {
            System.out.println("Canal Atual: " + televisao01.getCanalAtual().getNome());
            System.out.println("Número: " + televisao01.getCanalAtual().getNumero());
        } else {
            System.out.println("Nenhum canal sintonizado.");
        }
    }
}