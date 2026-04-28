package br.com.fiapride.main;

import br.com.fiapride.model.SmartTV;
import br.com.fiapride.model.TVPortatil;
import br.com.fiapride.model.Televisao;
import java.util.ArrayList;
import java.util.List;

public class TesteTelevisao {
    public static void main(String[] args) {
        List<Televisao> televisoes = new ArrayList<>();

        televisoes.add(new SmartTV("Samsung", 30, "Tizen", "Wi-Fi"));
        televisoes.add(new TVPortatil("Samsung", 30, 80));

        System.out.println("=== INICIANDO TESTE DE POLIMORFISMO ===");
        for (Televisao televisao : televisoes) {
            televisao.ligar(); 
            System.out.println("-----------------------");
        }
    }
}