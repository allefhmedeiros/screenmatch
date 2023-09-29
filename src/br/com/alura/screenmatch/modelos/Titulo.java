package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nomeObra;
    private boolean incluidoPlano;
    private double somaAvalicoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;
    private int anoLancamento;

    public Titulo(String nomeObra, int anoLancamento) {
        this.nomeObra = nomeObra;
        this.anoLancamento = anoLancamento;
    }

    public void exibeFichaTecnica() {
        System.out.println(String.format(
                """
                *************************************
                ******* FICHA TÉCNICA DA OBRA *******
                *************************************
                
                Nome da Obra: %s.
                Ano de Lançamento da Obra: %d.
                Duração da Obra em Minutos: %d.
                Total de Avaliações: %d.
                Média de Avaliações: %.2f.
                
                *************************************
                """
                , nomeObra, anoLancamento, duracaoMinutos, getTotalAvaliacoes(), obterMediaAvaliacoes()));
    }

    public void avaliaObra(double notaAvaliacao) {
        somaAvalicoes += notaAvaliacao;
        totalAvaliacoes++;
    }

    double obterMediaAvaliacoes() {
        return getSomaAvalicoes()/getTotalAvaliacoes();
    }

    int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    double getSomaAvalicoes(){
        return somaAvalicoes;
    }

    public void setNomeObra(String nomeObra) {
        this.nomeObra = nomeObra;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public String getNomeObra() {
        return nomeObra;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
}
