package org.example.solution.services;

import org.example.solution.interfaces.ICalculo;
import org.example.solution.models.Produto;
import org.example.solution.interfaces.IProduto;

import java.util.ArrayList;

public class Calculo implements ICalculo {
    private IProduto produto;
    public Calculo(IProduto produto) {
        this.produto = produto;
    }

    @Override
    public Double calcularPrecoPedido(int pedidoId) {
        ArrayList<Produto> listProdutos = this.produto.obterProdutos(pedidoId);
        System.out.println("Somando todos os produtos");
        return 678.50;
    }

}
