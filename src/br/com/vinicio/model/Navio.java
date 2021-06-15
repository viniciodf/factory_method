package br.com.vinicio.model;

public class Navio implements Transporte{
    @Override
    public String entregar() {
        return "Entregue por Navio";
    }
}
