package org.example;
import java.util.Date;

public class Atendente extends Funcionario{
    private int metaVendas;

    public Atendente(String nome, Date nascimento, double salario, int metaVendas) {
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.salario = salario;
        this.metaVendas = metaVendas;
    }

    public int getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(int metaVendas) {
        this.metaVendas = metaVendas;
    }
}
