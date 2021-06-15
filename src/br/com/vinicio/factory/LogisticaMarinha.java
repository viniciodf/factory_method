package br.com.vinicio.factory;

import br.com.vinicio.model.Navio;
import br.com.vinicio.model.Transporte;

public class LogisticaMarinha extends Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Navio();
    }

}
