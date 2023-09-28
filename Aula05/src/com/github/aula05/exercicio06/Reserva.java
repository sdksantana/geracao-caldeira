package com.github.aula05.exercicio06;
public class Reserva {
    private String nome;
    private String local;
    private String cpf;

    public Reserva(String nome, String local, String cpf) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
