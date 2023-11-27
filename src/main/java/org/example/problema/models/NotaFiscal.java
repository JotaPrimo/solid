package org.example.problema.models;

import org.example.problema.services.Calculo;

public class NotaFiscal {
    public void gerarNota(int pedidoId)
    {
        System.out.println("Gerando nota fiscal");
        Calculo calculo = new Calculo();
        Double precoPedido = calculo.calcularPrecoPedido(pedidoId);
        // rotina para gerar a nota fiscal
        System.out.println("VALOR : " + precoPedido);
    }

}
