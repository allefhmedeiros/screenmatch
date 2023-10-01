package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Harry Potter - As Relíquias da Morte - Parte 1", 2021);
        Filme novoFilme = new Filme("Animais Fantásticos - Onde Habitam", 2023);
        Filme filmePaulo = new Filme("DogVille", 2003);
        Serie novaSerie = new Serie("Lost", 2000);

        meuFilme.avaliaObra(9);
        novoFilme.avaliaObra(8);
        filmePaulo.avaliaObra(10);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmePaulo);
        lista.add(novoFilme);
        lista.add(meuFilme);
        lista.add(novaSerie);

        for (Titulo item: lista){
            System.out.println(item.getNomeObra());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao() + "\n");
            }
        }

        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Marlon Brando");
        buscaArtista.add("Anthony Hopkins");
        buscaArtista.add("Brad Pitt");
        buscaArtista.add("Tom Hanks");
        buscaArtista.add("Dustin Hoffman");
        buscaArtista.add("Al Pacino");
        buscaArtista.add("Robert De Niro");
        buscaArtista.add("Daniel Day-Lewis");
        buscaArtista.add("Ralph Fiennes");
        buscaArtista.add("Jessus Allefh");

        Collections.sort(buscaArtista);
        Collections.sort(lista);

        //CLASSIFICAÇÃO COM BASE COLLECTIONS --> COMPARABLE
        System.out.println(lista);
        System.out.println(buscaArtista);

        //CLASSIFICAÇÃO COM BASE COMPARATOR --> COMPARING
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(lista);
    }
}
