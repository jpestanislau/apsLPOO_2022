package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Gerente extends Funcionario{
    private ArrayList<Atendente> listaSubalternos;

    public Gerente(String nome, Date nascimento, double salario, ArrayList<Atendente> listaSubalternos) {
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.salario = salario;
        this.listaSubalternos = listaSubalternos;
    }

    public ArrayList<Atendente> getListaSubalternos() {
        return listaSubalternos;
    }

    public void setListaSubalternos(ArrayList<Atendente> listaSubalternos) {
        this.listaSubalternos = listaSubalternos;
    }
}
