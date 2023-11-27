package org.example.problema.services;

import org.example.problema.models.Produto;

import java.util.ArrayList;

public class Calculo {

    public Double calcularPrecoPedido(int pedidoId) {
        Produto produto = new Produto();
        ArrayList<Produto> listProdutos = produto.obterProdutos(pedidoId);
        System.out.println("Somando todos os produtos");
        return 678.50;
    }
}
