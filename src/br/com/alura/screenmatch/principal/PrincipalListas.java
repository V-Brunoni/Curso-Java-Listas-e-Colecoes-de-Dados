package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1978);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDeExemplo = new Filme("Dogville", 2003);
        filmeDeExemplo.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDeExemplo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println("Nome: " +item.getNome());
            if (item instanceof Filme filme ){  // Verifica se o item é um filme e já declara a variável filme
                System.out.println("Classificação: " + filme.getClassificacao());
            } else {
                System.out.println("Somente filmes possuem avaliação no momento!!!");
            }
        }

        // o forEach pode ser escrito dessa maneira também:   lista.forEach(item -> System.out.println(item));
        System.out.println("\n");
        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Kevin James");
        buscaArtista.add("David Space");
        buscaArtista.add("Chris Rock");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaArtista);
        System.out.println("\n");

        System.out.println(lista);
        System.out.println("Lista de títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }
}
