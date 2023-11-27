package org.example.solution.interfaces;

import org.example.solution.models.Produto;

import java.util.ArrayList;

public interface IProduto {
    public ArrayList<Produto> obterProdutos(int pedidoId);
}
