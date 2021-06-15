package br.com.vinicio.factory;

import br.com.vinicio.model.Caminhao;
import br.com.vinicio.model.Transporte;

public class LogisticaViaria extends Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Caminhao();
    }
}
