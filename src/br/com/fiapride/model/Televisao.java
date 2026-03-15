package br.com.fiapride.model;

public class Televisao {
    private int volume;
    private int numeroCanal;
    private boolean estaLigada;

    public Televisao(int volume, int numeroCanal) {
        this.setVolume(volume);
        this.setNumeroCanal(numeroCanal);
        this.setEstaLigada(false);;
    }

    public int getVolume() { 
        return this.volume; 
    }

    public int getNumeroCanal() { 
        return this.numeroCanal; 
    
    }
    
    public boolean getEstaLigada() { 
        return this.estaLigada; 
    }

    private void setVolume(int volumeDesejado) {
        if (volumeDesejado >= 0 && volumeDesejado <= 100) {
            this.volume = volumeDesejado;
        } else {
            System.out.println("ERRO: Volume " + volumeDesejado + " inválido.");
        }
    }

    private void setNumeroCanal(int numeroCanal) {
        if (numeroCanal > 0) {
            this.numeroCanal = numeroCanal;
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
}