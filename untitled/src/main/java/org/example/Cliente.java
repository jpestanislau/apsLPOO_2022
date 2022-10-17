package org.example;

import java.util.Date;

public class Cliente extends Pessoa{
    private String codigoFidadelidade;
    private int nivelFidelidade;

    public Cliente(String nome, Date nascimento, String codigoFidadelidade, int nivelFidelidade) {
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.codigoFidadelidade = codigoFidadelidade;
        this.nivelFidelidade = nivelFidelidade;
    }

    public String getCodigoFidadelidade() {
        return codigoFidadelidade;
    }

    public void setCodigoFidadelidade(String codigoFidadelidade) {
        this.codigoFidadelidade = codigoFidadelidade;
    }

    public int getNivelFidelidade() {
        return nivelFidelidade;
    }

    public void setNivelFidelidade(int nivelFidelidade) {
        this.nivelFidelidade = nivelFidelidade;
    }
}
