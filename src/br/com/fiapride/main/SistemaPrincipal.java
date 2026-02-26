package br.com.fiapride.main;

// import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Televisao;

public class SistemaPrincipal {

    public static void main(String[] args) {

//        Passageiro passageiro1 = new Passageiro();
//        passageiro1.nome = "Ana Silva";
//        passageiro1.saldo = 50.0;
//
//        // Criando o segundo passageiro (Objeto 2)
//        Passageiro passageiro2 = new Passageiro();
//        passageiro2.nome = "Carlos Souza";
//        passageiro2.saldo = 12.50;
//
//        // Exibindo os dados no Console
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

        Televisao televisao01 = new Televisao();
        televisao01.marca = "Samsung";
        televisao01.resolucaoEmPixels = 2160;
        televisao01.tamanho = 50;

        Televisao televisao02 = new Televisao();
        televisao02.marca = "LG";
        televisao02.resolucaoEmPixels = 4320;
        televisao02.tamanho = 32;

        System.out.println("Televisão 01 ---> Marca: " + televisao01.marca + " | Resolução em pixels: " + televisao01.resolucaoEmPixels + "p" + " | Tamanho: " + televisao01.tamanho + " polegadas");
        System.out.println("Televisão 02 ---> Marca: " + televisao02.marca + " | Resolução em pixels: " + televisao02.resolucaoEmPixels + "p" +" | Tamanho: " + televisao02.tamanho + " polegadas");

    }
}