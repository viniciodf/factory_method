package br.com.vinicio;

import br.com.vinicio.factory.LogisticaMarinha;
import br.com.vinicio.factory.LogisticaViaria;
import br.com.vinicio.model.Transporte;

import java.util.Scanner;

public class FactoryMethodApp {

    private static Transporte transporte;

    public static void main(String[] args) {
        String tipoTransporte = escolherTransporte();
        criarTransporte(tipoTransporte);
        realizarEntrega();
    }

    private static String escolherTransporte() {
        System.out.println("Escolha 1 para Navio e 2 para Caminhao");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void criarTransporte(String tipoTransporte) {
        if(tipoTransporte.equals("1")){
            LogisticaMarinha logisticaMarinha = new LogisticaMarinha();
            transporte = logisticaMarinha.criarTransporte();
        } else if(tipoTransporte.equals("2")){
            LogisticaViaria logisticaViaria = new LogisticaViaria();
            transporte = logisticaViaria.criarTransporte();
        }
    }

    public static void realizarEntrega(){
        String resultadoEntrega = transporte.entregar();
        System.out.println(resultadoEntrega);
    }
}
