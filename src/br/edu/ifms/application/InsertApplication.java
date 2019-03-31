package br.edu.ifms.application;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Genero;
import br.edu.ifms.model.Artista;
import br.edu.ifms.model.Filme;
import java.util.ArrayList;
import java.util.List;

public class InsertApplication {

    public static void main(String[] args) {

        //Dao generico para filme
        DaoGenerico<Filme> daoFilme = new DaoGenerico<>();

        //Listas de artistas e generos
        List listaArt = new ArrayList();
        List listGen = new ArrayList();

        //Add artistas na lista
        listaArt.add(new Artista("Ze"));
        listaArt.add(new Artista("Lucas"));
        listaArt.add(new Artista("Pedro"));
        listaArt.add(new Artista("Fernando"));

        //Add generos na lista
        listGen.add(new Genero("Drama"));
        listGen.add(new Genero("Comedia"));
        listGen.add(new Genero("Romance"));

        //Novo filme
        Filme filme = new Filme();
        filme.setNome("O vento levou");

        //Filme recebe a lista de artistas e generos
        filme.setArtistas(listaArt);
        filme.setGeneros(listGen);

        //Gravação do filme no banco
        daoFilme.saveOrUpdate(filme);

        System.out.println("Entidades salvas com sucesso!");
    }
}
