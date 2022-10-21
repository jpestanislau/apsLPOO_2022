package org.example;

import java.util.ArrayList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Criando os Atendentes
        Atendente atendente01 = new Atendente("Paulo Arruda","03/10/1997",50);
        Atendente atendente02 = new Atendente("Felipe Maia","22/03/1988",20);
        Atendente atendente03 = new Atendente("André Valadão","17/07/1966",15);

        //Criando as listas de subalternos
        ArrayList<Atendente> lista01 = new ArrayList<Atendente>();
        lista01.add(atendente01);
        lista01.add(atendente03);
        ArrayList<Atendente> lista02 = new ArrayList<Atendente>();
        lista01.add(atendente02);

        //Criando os Gerentes
        Gerente gerente01 = new Gerente("João Victor","05/03/1997",lista01);
        Gerente gerente02 = new Gerente("Rafael Tales","15/09/1996",lista02);

        //Criando Clientes
        Cliente cliente01 = new Cliente("Almeida Filho", "05/02/2013", "cod93", 3);
        Cliente cliente02 = new Cliente("Camilo Neto", "04/01/2005", "cod9f", 0);
        Cliente cliente03 = new Cliente("Tigrão Salgado", "05/02/1990", "cod93", 1);

        //Imprimindo estado inicial
        System.out.println("---ESTADO INICIAL---");
        System.out.println("Atendentes");
        System.out.println(atendente01.toString());
        System.out.println(atendente02.toString()+"\n");
        System.out.println("Gerente");
        System.out.println(gerente01.toString()+"\n");
        System.out.println("Clientes");
        System.out.println(cliente01.toString());
        System.out.println(cliente02.toString());
        System.out.println("-------------------");

        //Criando Pedidos
        Pedido pedido01 = new Pedido(cliente01, atendente01, 5000);
        Pedido pedido02 = new Pedido(cliente01, atendente02, 500);
        Pedido pedido03 = new Pedido(cliente02, gerente01, 100);

        //Imprimindo estado final
        System.out.println("---RESULTADO FINAL---");
        System.out.println("Atendentes");
        System.out.println(atendente01.toString());
        System.out.println(atendente02.toString()+"\n");
        System.out.println("Gerente");
        System.out.println(gerente01.toString()+"\n");
        System.out.println("Clientes");
        System.out.println(cliente01.toString());
        System.out.println(cliente02.toString());
        System.out.println("-------------------");

    }
}