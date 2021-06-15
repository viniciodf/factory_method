package br.com.vinicio.model;

public class Caminhao implements Transporte {
    @Override
    public String entregar() {
        return "Entregue por Caminhao";
    }
}
