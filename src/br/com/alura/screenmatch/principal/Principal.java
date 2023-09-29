package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.security.spec.ECParameterSpec;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Harry Potter - As Relíquias da Morte - Parte 1", 2021);
        meuFilme.setDuracaoMinutos(150);
        meuFilme.avaliaObra(8);
        meuFilme.avaliaObra(5);
        meuFilme.avaliaObra(10);
        meuFilme.exibeFichaTecnica();

        Serie novaSerie = new Serie("Lost", 2000);
        novaSerie.avaliaObra(8);
        novaSerie.avaliaObra(5);
        novaSerie.avaliaObra(9);
        novaSerie.avaliaObra(5);
        novaSerie.avaliaObra(7);
        novaSerie.avaliaObra(1);
        novaSerie.avaliaObra(10);
        novaSerie.setTotalTemporadas(20);
        novaSerie.setProducaoAtiva(true);
        novaSerie.setDuracaoMediaEpsodios(45);
        novaSerie.setEpsodiosTemporada(24);

        novaSerie.exibeFichaTecnica();

        Filme novoFilme = new Filme("Animais Fantásticos - Onde Habitam", 2023);
        novoFilme.setDuracaoMinutos(150);
        novoFilme.avaliaObra(10);
        novoFilme.avaliaObra(3);
        novoFilme.avaliaObra(6);
        novoFilme.avaliaObra(9);
        novoFilme.avaliaObra(8);
        novoFilme.avaliaObra(1);

        CalculadoraTempo calcule = new CalculadoraTempo();
        calcule.adicionaTitulo(meuFilme);
        calcule.adicionaTitulo(novoFilme);
        calcule.adicionaTitulo(novaSerie);
        System.out.println(calcule.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNome("Piloto");
        episodio.setNumero(1);
        episodio.setTemporada(1);
        episodio.setSerie(novaSerie);
        episodio.setTotalVisualizacoes(859);
        filtro.filtra(episodio);

        Filme filmePaulo = new Filme("DogVille", 2003);
        filmePaulo.setDuracaoMinutos(200);
        filmePaulo.avaliaObra(10);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        ArrayList<Serie> listaSeries = new ArrayList<>();
        listaFilmes.add(filmePaulo);
        listaFilmes.add(novoFilme);
        listaFilmes.add(meuFilme);
        listaSeries.add(novaSerie);
        System.out.println("Tamanho da Lista: " + listaFilmes.size());
        System.out.println("Primeiro Filme: " + listaFilmes.get(0).getNomeObra());
        System.out.println(listaFilmes);
        System.out.println(novaSerie);

    }
}
