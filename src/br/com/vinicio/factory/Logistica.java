package br.com.vinicio.factory;

import br.com.vinicio.model.Transporte;

public abstract class Logistica {
    public abstract Transporte criarTransporte();

    void realizarEntrega(){
        Transporte transporte = criarTransporte();
        String resultadoDaEntrega = transporte.entregar();
    }

}
