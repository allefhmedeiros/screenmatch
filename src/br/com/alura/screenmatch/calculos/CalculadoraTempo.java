package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void adicionaTitulo(Filme f) {
//        this.tempoTotal += f.getDuracaoMinutos();
//    }
//
//    public void adicionaTitulo(Serie s) {
//        this.tempoTotal += s.getDuracaoMinutos();
//    }

    public void adicionaTitulo(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

}
