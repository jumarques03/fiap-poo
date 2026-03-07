package br.com.fiapride.model;

public class Televisao {
    public int volume;
    public int numeroCanal;
    public boolean estaLigada;

    // def __init__ em Python
    public Televisao(int volume, int numeroCanal) {
        this.volume = volume;
        this.numeroCanal = numeroCanal;
        this.estaLigada = false;

    }

    // def ligarTevelisao(estadoTV: boolean) em Python
    public void ligarTelevisao(boolean estadoTV) {
        if (!estadoTV) {
            this.estaLigada = true;
            System.out.println("Televisão ligada!");
            return;
        }

        this.estaLigada = false;
        System.out.println("Você desligou a televisão! Ela já estava ligada.");
    }

    // def aumentarVolume(estadoTV: boolean) em Python
    public void aumentarVolume(boolean estadoTV, int volumeDesejado) {
        if (estadoTV) {
            if (volumeDesejado <= 0 || volumeDesejado >= 100) {
                System.out.println("O volume deve ser um valor entre 0 a 100");
                return;
            }

            this.volume = volumeDesejado;
            System.out.println("Volume aumentado para: " + this.volume);
            return;
        }

        System.out.println("A televisão está desligada! Ligue-a para conseguir aumentar o volume.");
    }
}
