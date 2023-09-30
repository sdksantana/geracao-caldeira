package com.github.aula06.exercicio03;

public class Contato implements Comparable<Contato> {
    String nome;
    String endereco;
    String zona;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Contato(String nome, String endereco, String zona) {
        this.nome = nome;
        this.endereco = endereco;
        this.zona = zona;
    }
    @Override
    public int compareTo(Contato outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {//Converte para string as informações do console
        return "\nNome: " + nome + ", Endereço: " + endereco + ", Zona: " + zona + " | ";
    }
}
