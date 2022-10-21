package org.example;

public class Pedido {
    private Cliente cliente;
    private Funcionario funcionario;
    private double valorDoPedido;

    public Pedido(Cliente cliente, Funcionario vendedor, double valorDoPedido) {
        this.cliente = cliente;
        this.funcionario = vendedor;

        //Aumentando o nível de fidelidade do cliente
        incrementaNivelFidelidade(cliente);

        //Dando a comissão ao vendedor
        vendedor.calcularComissao(valorDoPedido);
    }

    private void incrementaNivelFidelidade(Cliente cliente){
        cliente.setNivelFidelidade(
                cliente.getNivelFidelidade() + 1
        );
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorDoPedido() {
        return valorDoPedido;
    }

    public void setValorDoPedido(double valorDoPedido) {
        this.valorDoPedido = valorDoPedido;
    }

    @Override
    public String toString() {
        return "Nome C: " + this.cliente.getNome() + ", Nome V: " + this.funcionario.getNome() +
                ", Valor: " + this.valorDoPedido;
    }
}
