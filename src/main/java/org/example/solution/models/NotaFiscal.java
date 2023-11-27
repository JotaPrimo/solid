package org.example.solution.models;

import org.example.problema.services.Calculo;
import org.example.solution.interfaces.ICalculo;

public class NotaFiscal {
    private ICalculo calculo;
    public NotaFiscal(ICalculo calculo) {
        this.calculo = calculo;
    }

    public void gerarNota(int pedidoId)
    {
        System.out.println("Gerando nota fiscal");
        Double precoPedido = this.calculo.calcularPrecoPedido(pedidoId);
        // rotina para gerar a nota fiscal
        System.out.println("VALOR : " + precoPedido);
    }

}
