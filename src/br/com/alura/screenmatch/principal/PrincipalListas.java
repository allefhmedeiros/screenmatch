package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Harry Potter - As Relíquias da Morte - Parte 1", 2021);
        Filme novoFilme = new Filme("Animais Fantásticos - Onde Habitam", 2023);
        Filme filmePaulo = new Filme("DogVille", 2003);
        Serie novaSerie = new Serie("Lost", 2000);

        meuFilme.avaliaObra(9);
        novoFilme.avaliaObra(8);
        filmePaulo.avaliaObra(10);

        ArrayList<Titulo> lista = new ArrayList<>();
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

    }
}
