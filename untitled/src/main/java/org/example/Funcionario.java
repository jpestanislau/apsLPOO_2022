package org.example;

public abstract class Funcionario extends  Pessoa{
    protected double salario;
    protected double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void calcularComissao(double valorDoPedido);

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Salário: " + this.salario +
                ", Comissão: " + this.comissao;
    }
}
