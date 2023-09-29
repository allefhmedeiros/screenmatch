package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretorObra;

    public Filme(String nomeObra, int anoLancamento) {
        super(nomeObra, anoLancamento);
    }

    public String getDiretorObra() {
        return diretorObra;
    }

    public void setDiretorObra(String diretorObra) {
        this.diretorObra = diretorObra;
    }

    @Override
    public int getClassificacao() {
        return (int) obterMediaAvaliacoes()/2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNomeObra() + " (" + this.getAnoLancamento() + ")";
    }
}
