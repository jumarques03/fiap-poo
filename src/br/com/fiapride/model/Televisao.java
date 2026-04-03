package br.com.fiapride.model;

public class Televisao {
    private String marca;
    private double tamanhoPolegadas;
    private int volume;
    private boolean estaLigada;
    private Canal canalAtual;

    public Televisao(String marca, double tamanhoPolegadas) {
        // Esses dois atributos não precisam de setters pois devem ser definidos apenas uma vez (no momento de criação do objeto)
        this.marca = marca;
        this.tamanhoPolegadas = tamanhoPolegadas;
        this.setEstaLigada(false);
    }

    public String getMarca() { 
        return this.marca; 
    }
    public double getTamanhoPolegadas() { 
        return this.tamanhoPolegadas; 
    }

    public int getVolume() { 
        return this.volume; 
    }
    
    public boolean getEstaLigada() { 
        return this.estaLigada; 
    }

    public Canal getCanalAtual() {
        return canalAtual;  // Tem que acessar esse método para conseguir acessar os atributos da classe Canal
    }

    private void setVolume(int volumeDesejado) {
        if (volumeDesejado >= 0 && volumeDesejado <= 100) {
            this.volume = volumeDesejado;
        } else {
            System.out.println("ERRO: Volume " + volumeDesejado + " inválido.");
            return;
        }
    }

    private void setEstaLigada(boolean estaLigada) {
        this.estaLigada = estaLigada;
    }

    public void ligar() {
        if (!estaLigada) {
            setEstaLigada(true);
            System.out.println("Televisão ligada!");
        }
    }

    public void desligar() {
        if (estaLigada) {
            setEstaLigada(false);
            System.out.println("Televisão desligada.");
        }
    }

    public void ajustarVolume(int novoVolume) {
        if (estaLigada) {
            setVolume(novoVolume);
            System.out.println("Volume ajustado para: " + this.volume);
        } else {
            System.out.println("ERRO: TV desligada.");
        }
    }

    public void sintonizarCanal(Canal novoCanal) {
        if (estaLigada) {
            this.canalAtual = novoCanal;
            System.out.println("Sintonizado no canal: " + novoCanal.getNome() + " (nº " + novoCanal.getNumero() + ")");
        } else {
            System.out.println("ERRO: Não é possível mudar de canal com a TV desligada.");
        }
    }
}