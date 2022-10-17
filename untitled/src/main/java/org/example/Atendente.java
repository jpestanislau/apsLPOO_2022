package org.example;
import java.util.Date;

public class Atendente extends Funcionario{
    private int metaVendas;

    public Atendente(String nome, Date nascimento, int metaVendas) {
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.salario = 2500.00;
        this.metaVendas = metaVendas;
    }

    public void calcularComissao(double valorDoPedido){
        this.comissao += valorDoPedido * 0.02;
    }

    public int getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(int metaVendas) {
        this.metaVendas = metaVendas;
    }
}
