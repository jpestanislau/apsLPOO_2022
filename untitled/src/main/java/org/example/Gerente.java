package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Gerente extends Funcionario{
    private ArrayList<Atendente> listaSubalternos;

    public Gerente(String nome, Date nascimento, ArrayList<Atendente> listaSubalternos) {
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.salario = 4500.00;
        this.listaSubalternos = listaSubalternos;
    }

    public void calcularComissao(double valorDoPedido){
        this.comissao += valorDoPedido * 0.03;
    }

    public ArrayList<Atendente> getListaSubalternos() {
        return listaSubalternos;
    }

    public void setListaSubalternos(ArrayList<Atendente> listaSubalternos) {
        this.listaSubalternos = listaSubalternos;
    }
}
