package br.com.fiapride.model;

public class Canal {
    private int numero;
    private String nome;
    
    public Canal(int numero, String nome) {
        this.setNumero(numero);
        this.setNome(nome);
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    private void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            throw new IllegalArgumentException("Número do canal deve ser maior que zero.");
        }
    }

    private void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome do canal não pode ser vazio.");
        }
    }
}
