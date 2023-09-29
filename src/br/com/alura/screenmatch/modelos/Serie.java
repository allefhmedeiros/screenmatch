package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{

    private int totalTemporadas;
    private boolean producaoAtiva;
    private int duracaoMediaEpsodios;
    private int epsodiosTemporada;

    public Serie(String nomeObra, int anoLancamento) {
        super(nomeObra, anoLancamento);
    }

    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public boolean isProducaoAtiva() {
        return producaoAtiva;
    }

    public void setProducaoAtiva(boolean producaoAtiva) {
        this.producaoAtiva = producaoAtiva;
    }

    public int getDuracaoMediaEpsodios() {
        return duracaoMediaEpsodios;
    }

    public void setDuracaoMediaEpsodios(int duracaoMediaEpsodios) {
        this.duracaoMediaEpsodios = duracaoMediaEpsodios;
    }

    public int getEpsodiosTemporada() {
        return epsodiosTemporada;
    }

    public void setEpsodiosTemporada(int epsodiosTemporada) {
        this.epsodiosTemporada = epsodiosTemporada;
    }

    @Override
    public int getDuracaoMinutos() {
        return duracaoMediaEpsodios * epsodiosTemporada * totalTemporadas;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println(String.format(
                """
                *************************************
                ******* FICHA TÉCNICA DA OBRA *******
                *************************************
                
                Tipo de Obra: Serie!
                
                Nome da Obra: %s.
                Ano de Lançamento da Obra: %d.
                Duração da Obra em Minutos: %d.
                Total de Avaliações: %d.
                Média de Avaliações: %.2f.
                
                Total de Temporadas: %d.
                Título em Produção? %s.
                Duração Média dos Epsódios: %d.
                Total de Epsódios por Temporada: %d.
                
                
                *************************************
                """,
                super.getNomeObra(),
                super.getAnoLancamento(),
                getDuracaoMinutos(),
                getTotalAvaliacoes(),
                obterMediaAvaliacoes(),
                getTotalTemporadas(),
                isProducaoAtiva(),
                getDuracaoMediaEpsodios(),
                getEpsodiosTemporada()));
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNomeObra() + " (" + this.getAnoLancamento() + ")";
    }

}
