package br.com.vinicio;

import br.com.vinicio.factory.LogisticaMarinha;
import br.com.vinicio.factory.LogisticaViaria;
import br.com.vinicio.model.Transporte;

public class FactoryMethodApp {

    public static void main(String[] args) {
        LogisticaMarinha logisticaMarinha = new LogisticaMarinha();
        Transporte transporteMarinho = logisticaMarinha.criarTransporte();
        String resultadoEntregaMarinha = transporteMarinho.entregar();
        System.out.println(resultadoEntregaMarinha);

        LogisticaViaria logisticaViaria = new LogisticaViaria();
        Transporte transporteViario = logisticaViaria.criarTransporte();
        String resultadoEntregaViaria = transporteViario.entregar();
        System.out.println(resultadoEntregaViaria);
    }
}
